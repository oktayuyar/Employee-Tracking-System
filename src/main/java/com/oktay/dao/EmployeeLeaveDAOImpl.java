/**
 * 
 */
package com.oktay.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oktay.model.EmployeeLeave;

/**
 * @author oktay
 *
 */
@Repository
public class EmployeeLeaveDAOImpl implements EmployeeLeaveDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addEmployeeLeave(EmployeeLeave empLeave) {
		sessionFactory.getCurrentSession().saveOrUpdate(empLeave);
		
	}

	@SuppressWarnings("unchecked")
	public List<EmployeeLeave> getAllEmployeeLeaves(Integer empId) {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(EmployeeLeave.class);
		cr.add(Restrictions.eq("employee.id", empId));
		return cr.list();
	}

	@Override
	public void deleteEmployeeLeave(Integer empLeaveId) {
		EmployeeLeave empLeave = (EmployeeLeave) sessionFactory.getCurrentSession().load(EmployeeLeave.class, empLeaveId);
		if (null != empLeave) {
			this.sessionFactory.getCurrentSession().delete(empLeave);
		}
	}
	
	@Override
	public EmployeeLeave getEmployeeLeave(int empLeaveId) {
		return (EmployeeLeave) sessionFactory.getCurrentSession().get(EmployeeLeave.class, empLeaveId);
		
	}
	
	@Override
	public EmployeeLeave updateEmployeeLeave(EmployeeLeave empLeave) {
		sessionFactory.getCurrentSession().update(empLeave);
		return empLeave;
				
	}
	
}

/**
 * 
 */
package com.oktay.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oktay.model.EmployeeLeave;

/**
 * @author oktay
 *
 */
public class EmployeeLeaveDAOImpl implements EmployeeLeaveDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployeeLeave(EmployeeLeave empLeave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeLeave> getAllEmployeeLEaves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeLeave updateEmployeeLeave(EmployeeLeave empLeave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeLeave getEmployeeLeave(int empLeaveId) {
		// TODO Auto-generated method stub
		return null;
	}

}

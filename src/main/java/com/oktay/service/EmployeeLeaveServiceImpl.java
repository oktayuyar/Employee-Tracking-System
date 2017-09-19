/**
 * 
 */
package com.oktay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oktay.dao.EmployeeLeaveDAO;
import com.oktay.model.EmployeeLeave;

/**
 * @author oktay
 *
 */
@Service
@Transactional
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService{
    
	@Autowired
    private EmployeeLeaveDAO employeeLeaveDAO;
	
	@Override
    @Transactional
	public void addEmployeeLeave(EmployeeLeave empLeave) {
		employeeLeaveDAO.addEmployeeLeave(empLeave);
		
	}

	@Override
    @Transactional
	public List<EmployeeLeave> getAllEmployeeLeaves(Integer empId) {
		return employeeLeaveDAO.getAllEmployeeLeaves(empId);
	}

    @Override
    @Transactional
	public void deleteEmployeeLeave(Integer empLeaveId) {
		employeeLeaveDAO.deleteEmployeeLeave(empLeaveId);
		
	}
	
	@Override
	public EmployeeLeave updateEmployeeLeave(EmployeeLeave empLeave) {
		return employeeLeaveDAO.updateEmployeeLeave(empLeave);
	}

	@Override
	public EmployeeLeave getEmployeeLeave(int empLeaveId) {
		return employeeLeaveDAO.getEmployeeLeave(empLeaveId);
	}

	public void setEmployeeLeaveDAO(EmployeeLeaveDAO employeeLeaveDAO) {
		this.employeeLeaveDAO = employeeLeaveDAO;
	}

}

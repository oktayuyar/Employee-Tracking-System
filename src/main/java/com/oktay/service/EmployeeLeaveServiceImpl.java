/**
 * 
 */
package com.oktay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oktay.dao.EmployeeLeaveDAO;
import com.oktay.model.EmployeeLeave;

/**
 * @author oktay
 *
 */
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService{
    
	@Autowired
    private EmployeeLeaveDAO employeeLeaveDAO;
	
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

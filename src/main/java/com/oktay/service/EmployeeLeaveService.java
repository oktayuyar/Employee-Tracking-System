package com.oktay.service;

import java.util.List;

import com.oktay.model.EmployeeLeave;

/**
 * @author oktay
 *
 */
public interface EmployeeLeaveService {

	public void addEmployeeLeave(EmployeeLeave empLeave);

	public List<EmployeeLeave> getAllEmployeeLeaves(Integer empId);
	
	public void deleteEmployeeLeave(Integer empLeaveId);

	public EmployeeLeave updateEmployeeLeave(EmployeeLeave empLeave);

	public EmployeeLeave getEmployeeLeave(int empLeaveId);
}

package com.oktay.service;

import java.util.List;

import com.oktay.model.EmployeeLeave;

/**
 * @author oktay
 *
 */
public interface EmployeeLeaveService {

	public void addEmployeeLeave(EmployeeLeave empLeave);

	public List<EmployeeLeave> getAllEmployeeLEaves();

	public EmployeeLeave updateEmployeeLeave(EmployeeLeave empLeave);

	public EmployeeLeave getEmployeeLeave(int empLeaveId);
}

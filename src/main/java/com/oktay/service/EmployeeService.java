package com.oktay.service;

import java.util.List;

import com.oktay.model.Employee;

/**
 * @author oktay
 *
 */
public interface EmployeeService {
	
    public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(int employeeId);
}

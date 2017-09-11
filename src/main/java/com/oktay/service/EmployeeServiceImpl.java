/**
 * 
 */
package com.oktay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oktay.dao.EmployeeDAO;
import com.oktay.model.Employee;

/**
 * @author oktay
 *
 */
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int employeeid) {
		// TODO Auto-generated method stub
		return null;
	}

}

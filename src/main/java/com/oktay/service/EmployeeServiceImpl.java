/**
 * 
 */
package com.oktay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oktay.dao.EmployeeDAO;
import com.oktay.model.Employee;

/**
 * @author oktay
 *
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;
	
    @Override
    @Transactional
	public void addEmployee(Employee employee) {
    	employeeDAO.addEmployee(employee);
		
	}

    @Override
    @Transactional
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

    @Override
    @Transactional
	public void deleteEmployee(Integer employeeId) {
    	employeeDAO.deleteEmployee(employeeId);
	}

	public Employee getEmployee(int employeeId) {
    	return employeeDAO.getEmployee(employeeId);
	}

	public Employee updateEmployee(Employee employee) {
    	 return employeeDAO.updateEmployee(employee);
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

}

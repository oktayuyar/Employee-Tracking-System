/**
 * 
 */
package com.oktay.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.oktay.model.Employee;
import com.oktay.model.EmployeeLeave;
import com.oktay.service.EmployeeLeaveService;
import com.oktay.service.EmployeeService;

/**
 * @author oktay
 *
 */
@Controller
public class EmployeeLeaveController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeLeaveService employeeLeaveService;
	
	@RequestMapping(value = "/newEmployeeLeave", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		EmployeeLeave employeeLeave = new EmployeeLeave();
		model.addObject("employeeLeave", employeeLeave);
		model.setViewName("EmployeeLeaveForm");
		
		return model;
	}

}

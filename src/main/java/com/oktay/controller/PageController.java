package com.oktay.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oktay.model.Employee;


/**
 *oktay
 */
@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@RequestMapping(value = "/")
	public String loadPage(){
		logger.info("Welcome to home page .");
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String loadHomePage(){
		logger.info("Welcome to home page .");
		return "home";
	}
	
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public String loadEmployeePage() {
		logger.info("Welcome to add employee page .");

		return "newEmployee";
	}
	
}

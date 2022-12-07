package com.kawarides.app.controller.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kawarides.admin.model.Customers;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	public void setToSession(HttpServletRequest request ,Customers customers){
		
		request.getSession().setAttribute("userName", customers.getUserName());
		request.getSession().setAttribute("customerId",customers.getCustomerId());
		
	}
	
	
}

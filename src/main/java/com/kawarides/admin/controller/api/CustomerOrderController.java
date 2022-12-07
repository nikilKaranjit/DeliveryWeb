package com.kawarides.admin.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kawarides.admin.model.CustomerOrder;
import com.kawarides.admin.service.CustomerOrderService;

@RestController
@RequestMapping("/order")
public class CustomerOrderController {

	private CustomerOrderService customerOrderService;
	
	
	
	
	@Autowired
	public CustomerOrderController(CustomerOrderService customerOrderService) {
		super();
		this.customerOrderService = customerOrderService;
	}




	@RequestMapping("/add")
	public CustomerOrder addcustomerOrder(@RequestBody  CustomerOrder customerOrder){
		return customerOrderService.addCustomerOrder(customerOrder);
	}
}

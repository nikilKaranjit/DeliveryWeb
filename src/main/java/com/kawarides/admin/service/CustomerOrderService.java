package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.CustomerOrder;



public interface CustomerOrderService {
	 List<CustomerOrder> listCustomerOrder();
	 CustomerOrder findone( Long customerOrderId);
	 CustomerOrder addCustomerOrder(CustomerOrder customerOrder);
	 
 
}

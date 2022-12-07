package com.kawarides.admin.service;

import java.util.List;


import com.kawarides.admin.model.Customers;

public interface CustomersService {
	 List<Customers> listCustomers();
	 Customers findone( Long customerId);
	 Customers SaveCustomer(Customers customers);
	 String deleteCustomers (Long customerId);
	 Customers findByEmail(String email);

}

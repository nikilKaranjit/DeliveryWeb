package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.Customers;
import com.kawarides.admin.repository.CustomersRepository;
import com.kawarides.admin.service.CustomersService;

@Service
public class CustomerServiceImpl implements CustomersService {
	
	private CustomersRepository customersRepository;
	
	
    @Autowired
	public CustomerServiceImpl(CustomersRepository customersRepository) {
		super();
		this.customersRepository = customersRepository;
	}

	@Override
	public List<Customers> listCustomers() {
		// TODO Auto-generated method stub
		return customersRepository.findAll();
	}

	@Override
	public Customers findone(Long customerId) {
		// TODO Auto-generated method stub
		return customersRepository.findOne(customerId);
	}

	@Override
	public Customers SaveCustomer(Customers customers) {
		// TODO Auto-generated method stub
		return customersRepository.save(customers);
	}

	@Override
	public String deleteCustomers(Long customerId) {
		// TODO Auto-generated method stub
		customersRepository.delete(customerId);
		return "customer deleted";
	}

	@Override
	public Customers findByEmail(String email) {
		// TODO Auto-generated method stub
		return customersRepository.findByEmail(email);
	}

}

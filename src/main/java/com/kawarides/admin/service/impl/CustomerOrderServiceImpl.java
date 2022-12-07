package com.kawarides.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kawarides.admin.model.CustomerOrder;
import com.kawarides.admin.repository.CustomerOrderRepository;
import com.kawarides.admin.repository.CustomersRepository;
import com.kawarides.admin.repository.DeliveryAddressRepository;
import com.kawarides.admin.repository.ProductRepository;
import com.kawarides.admin.service.CustomerOrderService;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

	
	
	private CustomerOrderRepository customerOrderRepository;
	private DeliveryAddressRepository deliveryAddressRepository;
	private CustomersRepository customersRepository;
	private ProductRepository productRepository;
	

    

	@Autowired
	public CustomerOrderServiceImpl(CustomerOrderRepository customerOrderRepository,
			DeliveryAddressRepository deliveryAddressRepository, CustomersRepository customersRepository) {
		super();
		this.customerOrderRepository = customerOrderRepository;
		this.deliveryAddressRepository = deliveryAddressRepository;
		this.customersRepository = customersRepository;
		
	}





	@Override
	public List<CustomerOrder> listCustomerOrder() {
		// TODO Auto-generated method stub
		return customerOrderRepository.findAll();
	}

	

	

	@Override
	public CustomerOrder findone(Long customerOrderId) {
		// TODO Auto-generated method stub
		return customerOrderRepository.findOne(customerOrderId);
	}





	@Override
	public CustomerOrder addCustomerOrder(CustomerOrder customerOrder) {
		customerOrder.setDeliveryaddress(deliveryAddressRepository.findOne(customerOrder.getDeliveryaddress().getId()));
		customerOrder.setCustomers(customersRepository.findOne(customerOrder.getCustomers().getCustomerId()));
		customerOrder.setProducts(productRepository.findOne(customerOrder.getProducts().getProductId()));
		return customerOrderRepository.save(customerOrder);
	}





	








	

}

package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.Customers;
import com.kawarides.admin.model.DeliveryAddress;
import com.kawarides.admin.repository.CustomersRepository;
import com.kawarides.admin.repository.DeliveryAddressRepository;
import com.kawarides.admin.repository.ZoneRepository;
import com.kawarides.admin.service.DeliveryAddressService;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

	private DeliveryAddressRepository deliveryAddressRepository;
	private CustomersRepository customersRepository;
	private ZoneRepository zoneRepository;

	
	@Autowired
	public DeliveryAddressServiceImpl(DeliveryAddressRepository deliveryAddressRepository,
			CustomersRepository customersRepository, ZoneRepository zoneRepository) {
		super();
		this.deliveryAddressRepository = deliveryAddressRepository;
		this.customersRepository = customersRepository;
		this.zoneRepository = zoneRepository;
	}



	@Override
	public DeliveryAddress addAddress(Long customerId, DeliveryAddress deliveryaddress) {
	    Customers customers=customersRepository.findOne(customerId);
	    deliveryaddress.setZone(zoneRepository.findOne(deliveryaddress.getZone().getZoneId()));
		return deliveryAddressRepository.save(deliveryaddress);
	}



	@Override
	public List<DeliveryAddress> listAddress(Customers customers) {
		// TODO Auto-generated method stub
		return null;
	}

}

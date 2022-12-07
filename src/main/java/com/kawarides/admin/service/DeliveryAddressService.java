package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.Customers;
import com.kawarides.admin.model.DeliveryAddress;

public interface DeliveryAddressService {
 List<DeliveryAddress> listAddress(Customers customers);
 DeliveryAddress addAddress(Long customerId,DeliveryAddress deliveryaddress);
}

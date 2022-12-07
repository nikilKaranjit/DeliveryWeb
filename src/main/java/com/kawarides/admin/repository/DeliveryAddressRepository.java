package com.kawarides.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kawarides.admin.model.DeliveryAddress;

public interface DeliveryAddressRepository extends JpaRepository< DeliveryAddress, Long> {

}

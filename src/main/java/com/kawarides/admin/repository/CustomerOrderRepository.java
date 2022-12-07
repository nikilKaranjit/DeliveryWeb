package com.kawarides.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kawarides.admin.model.CustomerOrder;
import com.kawarides.admin.model.Customers;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
 List<CustomerOrder> findAllByCustomers(Customers customers);
}

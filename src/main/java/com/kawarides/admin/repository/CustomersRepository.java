package com.kawarides.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kawarides.admin.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Long> {
	Customers findByEmail(String email);
}

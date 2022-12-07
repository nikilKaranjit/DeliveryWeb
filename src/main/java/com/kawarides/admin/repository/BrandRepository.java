package com.kawarides.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kawarides.admin.model.Brands;


public interface BrandRepository extends JpaRepository<Brands,Long> {
	
}

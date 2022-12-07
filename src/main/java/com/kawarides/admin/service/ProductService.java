package com.kawarides.admin.service;

import java.util.List;


import com.kawarides.admin.model.Products;

public interface ProductService {
	List<Products> listProducts();
	 Products findone( Long productId);
	 Products addProducts(Products products);
	 String deleteProducts (Long productId);
	 List<Products> findProducts(String keyword);
}

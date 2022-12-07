package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kawarides.admin.model.Products;
import com.kawarides.admin.repository.BrandRepository;
import com.kawarides.admin.repository.CategoryRepository;
import com.kawarides.admin.repository.ProductRepository;
import com.kawarides.admin.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	private BrandRepository brandRepository;
	
	
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository,
			BrandRepository brandRepository) {
		super();
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Products> listProducts() {
		// TODO Auto-generated method stub
		return  productRepository.findAll();
	}

	@Override
	public Products findone(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.findOne(productId);
	}

	@Override
	public Products addProducts(Products products) {
		// TODO Auto-generated method stub
		products.setBrands(brandRepository.findOne(products.getBrands().getId()));
		products.setCategories(categoryRepository.findOne(products.getCategories().getId()));
		return productRepository.save(products);
	}

	@Override
	public String deleteProducts(Long productId) {
		productRepository.delete(productId);
		return "productdeleted";
	}

	@Override
	public List<Products> findProducts(String keyword) {
		// TODO Auto-generated method stub
		return (List<Products>) productRepository.findProducts(keyword);
	}

}

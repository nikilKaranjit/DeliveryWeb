package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.Brands;
import com.kawarides.admin.repository.BrandRepository;
import com.kawarides.admin.service.BrandService;

@Service
public class BrandsServiceImpl implements BrandService{
	
	
	private BrandRepository brandRepository;
	
	
	@Autowired
	public BrandsServiceImpl(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brands> listBrand() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

	@Override
	public Brands findone(Long id) {
		// TODO Auto-generated method stub
		return brandRepository.findOne(id);
	}

	@Override
	public Brands addBrands(Brands brands) {
		// TODO Auto-generated method stub
		return brandRepository.save(brands);
	}

	@Override
	public String deleteBrands(Long id) {
		// TODO Auto-generated method stub
		 brandRepository.delete(id);
		 return "brand does not exist any more";
	}

}

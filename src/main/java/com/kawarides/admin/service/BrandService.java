package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.Brands;


public interface BrandService {
	 List<Brands> listBrand();
	 Brands findone( Long id);
	 Brands addBrands(Brands brands);
	 String deleteBrands (Long id);

}

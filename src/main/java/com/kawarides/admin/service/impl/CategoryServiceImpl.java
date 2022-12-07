package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.Categories;
import com.kawarides.admin.repository.CategoryRepository;
import com.kawarides.admin.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository  categoryRepository;
	
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Categories> listCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Categories findone(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}

	@Override
	public Categories addCategories(Categories categories) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categories);
	}

	@Override
	public String deleteCategories(Long id) {
		// TODO Auto-generated method stub
	    categoryRepository.delete(id);
	    return"{Id has been deleted}";
	}



	

}

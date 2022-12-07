package com.kawarides.admin.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kawarides.admin.model.Categories;
import com.kawarides.admin.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoriesController {

	
	private CategoryService categoryService;

	@Autowired
	public CategoriesController(CategoryService categoryService) {
		
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/list")
	public List <Categories> listCategory(){
		return categoryService.listCategory();
	}
	
	@RequestMapping("/list/{catId}")
	public Categories findOne(@PathVariable Long catId){
		return categoryService.findone(catId);
	}
	
	@RequestMapping("/add")
	public Categories addCateogory(@RequestBody Categories categories){
		return categoryService.addCategories(categories);
	}
	
}

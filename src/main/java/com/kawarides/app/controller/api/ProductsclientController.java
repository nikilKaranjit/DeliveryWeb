package com.kawarides.app.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kawarides.admin.model.Products;
import com.kawarides.admin.service.BrandService;
import com.kawarides.admin.service.CategoryService;
import com.kawarides.admin.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductsclientController {
	private ProductService productService;
	private CategoryService categoryService;
	private BrandService brandService;
	
	
	
	@Autowired
	public ProductsclientController(ProductService productService, CategoryService categoryService,
			BrandService brandService) {
		super();
		this.productService = productService;
		this.categoryService = categoryService;
		this.brandService = brandService;
	}
	
				@GetMapping("/list")
				private String productList(Model model){
    			model.addAttribute("Products",productService.listProducts());
				return "/productview/list";
			}
	
	    	@GetMapping(value="/form")
	        public String insertform(Products products,Model model){
	    	model.addAttribute("products",new Products());
	    	model.addAttribute("categories",categoryService.listCategory());
	    	model.addAttribute("brands", brandService.listBrand());
	           return "/productview/productform";
	  
	    }
	
}

package com.kawarides.admin.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kawarides.admin.model.Categories;

import com.kawarides.admin.service.CategoryService;

@Controller
@RequestMapping("/categoryview")
public class CategoryViewController {
	
	private CategoryService categoryService;

	public CategoryViewController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	
    @GetMapping("/list")
    public String categoryList(Model model){
	model.addAttribute("categories",categoryService.listCategory());
    return "/categoryview/list"; 
}
    @GetMapping(value="/form")
    public String insertform(Categories categories,Model model){
    	model.addAttribute("categories",new Categories());
    	return "/categoryview/categoryForm";
    	
    }
    @GetMapping(value="/updateform/{id}")
    public String updateCategory(@PathVariable Long id,Model model,Categories categories){
    	model.addAttribute("categories",categoryService.findone(id));
    	return "/categoryview/categoryUpdate";
    	
    }
    @RequestMapping("/deletecategory/{id}")
    public String deleteCategory(@PathVariable Long id){
    	categoryService.deleteCategories(id);
    	return "redirect:/categoryview/list";
    }
    
    @PostMapping(value="/save")
    public String saveCategory(@ModelAttribute ("categories") Categories categories){
    	categoryService.addCategories(categories);
    	return "redirect:/categoryview/list";
    }

}

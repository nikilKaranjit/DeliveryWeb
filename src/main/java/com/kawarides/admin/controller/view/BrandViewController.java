package com.kawarides.admin.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kawarides.admin.model.Brands;
import com.kawarides.admin.service.BrandService;

@Controller
@RequestMapping("/brandsview")
public class BrandViewController {

	private BrandService brandService;

	@Autowired
	public BrandViewController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	   @GetMapping("/list")
	    public String brandList(Model model){
		model.addAttribute("brands",brandService.listBrand());
	    return "/brandsview/list"; 
	}
	   
	   @GetMapping(value="/form")
	    public String insertform(Brands brand,Model model){
	    model.addAttribute("brands",new Brands());
	    return "/brandsview/brandForm";
	    }
	   
	   @GetMapping(value="/updateform/{id}")
	    public String updateBrand(@PathVariable Long id,Model model,Brands brands){
	    	model.addAttribute("brands",brandService.findone(id));
	    	return "/brandsview/brandUpdate";
	    	
	    }
	    @RequestMapping("/deletebrand/{id}")
	    public String deleteBrand(@PathVariable Long id){
	    	brandService.deleteBrands(id);
	    	return "redirect:/brandsview/list";
	    }
	    
	    @PostMapping(value="/save")
	    public String saveBrand(@ModelAttribute ("brands") Brands brands){
	       brandService.addBrands(brands);
	    	return "redirect:/brandsview/list";
	    }
}

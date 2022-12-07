package com.kawarides.admin.controller.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kawarides.admin.constant.FileConstant;
import com.kawarides.admin.model.Products;

import com.kawarides.admin.service.BrandService;
import com.kawarides.admin.service.CategoryService;
import com.kawarides.admin.service.ProductService;



@Controller
@RequestMapping("/productview")
public class ProductViewController {
	
	private ProductService productService;
	private CategoryService categoryService;
	private BrandService brandService;
	
	
	
	@Autowired
	public ProductViewController(ProductService productService, CategoryService categoryService,
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
			    	
			    	@GetMapping(value="/search")
			    	public String Search(@RequestParam String keyword,Model model){
			            if(StringUtils.isNotEmpty(keyword)){
			        	 List<Products> list=(List<Products>) productService.findProducts(keyword);
			        	 if(CollectionUtils.isEmpty(list)){
			        	 model.addAttribute("emptyMessage","Product list is empty");
			        	 }
			         }
			    		return null;
			    	}
	    	
	    	
	    	
	    	
	    	 @GetMapping(value="/updateform/{productId}")
	    	  public String updateCategory(@PathVariable Long productId,Model model,Products products){
	    	  model.addAttribute("products",productService.findone(productId));
	    	  model.addAttribute("categories",categoryService.listCategory());
	    	  model.addAttribute("brands", brandService.listBrand());
	    	  return "/productview/productUpdate";
	    	 }
	    	
	    	 @RequestMapping("/deleteproduct/{productId}")
	    	 public String deleteProduct(@PathVariable Long productId){
	    	 productService.deleteProducts(productId);
	    	 return "redirect:/productview/list";
	    	    }
	    	
	    	
	    	  @PostMapping(value="/save")
	    	   public String saveProducts(@ModelAttribute ("products") Products products,
	    	   @RequestParam("file")MultipartFile file,RedirectAttributes redirectAttributes){
	    		 
	    		 if(file.isEmpty()){
	    			 redirectAttributes.addFlashAttribute("message","Please choose image to upload");
	    			 
	    		 }
	    		    try 	{
	    			 	byte[] bytes = file.getBytes();
	    	            Path path = Paths.get( FileConstant.UPLOADDIR + file.getOriginalFilename());
	    	            products.setImageURl(file.getOriginalFilename());
	    	            Files.write(path, bytes);

	                    redirectAttributes.addFlashAttribute("message",
	    	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
	                  
	    	        } catch (IOException e) {
	    	            e.printStackTrace();
	    	        }
	    		 
	    		 
	    		  	productService.addProducts(products);
	    	    	return "redirect:/productview/list";
	    	    }

	    	  
	    	  
	    	  
}

package com.kawarides.admin.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kawarides.admin.model.Customers;
import com.kawarides.admin.service.CustomersService;

@Controller
@RequestMapping("/customers")
public class CustomersViewController {
	
 private  CustomersService  customersService;

 
 @Autowired
public CustomersViewController(CustomersService customersService) {
	super();
	this.customersService = customersService;
	
}

           @GetMapping("/list")
           public String customersList(Model model){
	       model.addAttribute("Customers",customersService.listCustomers());
           return "/customersview/list"; 
          }
 
       
           @RequestMapping("/deletecustomer/{customerId}")
   	       public String deleteCustomer(@PathVariable Long customerId){
   	    	customersService.deleteCustomers(customerId);
   	    	return "redirect:/customersview/list";
   	    }
   	    
           public String enableCustomer(@PathVariable Long customerId){
        	   Customers customers = customersService.findone(customerId);
        	   customers.setStatus(true);
        	   customersService.SaveCustomer(customers);
        	   return"redirect:/customersview/list";
        	   
           }
 
           public String disableCustomer(@PathVariable Long customerId){
        	   Customers customers = customersService.findone(customerId);
        	   customers.setStatus(false);
        	   customersService.SaveCustomer(customers);
        	   return"redirect:/customersview/list";
        	   
           }

}

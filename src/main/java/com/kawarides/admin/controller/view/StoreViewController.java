package com.kawarides.admin.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kawarides.admin.model.Products;
import com.kawarides.admin.model.Store;
import com.kawarides.admin.service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreViewController {

	private StoreService storeService;

	@Autowired
	public StoreViewController(StoreService storeService) {
		super();
		this.storeService = storeService;
	}
	
	@GetMapping("/list")
	public String listStore(Model model){
		model.addAttribute("Store",storeService.listStore());
		return "/storeview/list";
	}
	
	@GetMapping("/form")
	public String addStore(Store store,Model model){
		model.addAttribute("store",new Store());
		return "/storeview/form";
	}
	
	@GetMapping("/edit/{storeId}")
	public String updateStore(@PathVariable Long storeId,Model model,Store store){
		model.addAttribute("Store",storeService.findone(storeId));
	     return "/storeview/updateform";
	}
	
	public String deleteStore(@PathVariable Long storeId,Model model,Store store){
		model.addAttribute(storeService.deleteStore(storeId));
		return "/storeview/list";
	}
}

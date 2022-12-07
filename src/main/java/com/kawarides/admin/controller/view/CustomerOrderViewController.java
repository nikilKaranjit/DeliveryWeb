package com.kawarides.admin.controller.view;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kawarides.admin.service.CustomerOrderService;
import com.kawarides.admin.service.CustomersService;
import com.kawarides.admin.service.DeliveryAddressService;
import com.kawarides.admin.service.ProductService;

@Controller
@RequestMapping("/orderview")
public class CustomerOrderViewController {
	
	
	private CustomerOrderService customerOrderService;
	private DeliveryAddressService deliveryAddressService;
	private ProductService productService;
	private CustomersService customersService;
	
	
	@Autowired
	public CustomerOrderViewController(CustomerOrderService customerOrderService) {
		super();
		this.customerOrderService = customerOrderService;
	}



	@RequestMapping("/list")
	public String  customerOrderList(Model model,Long customerId){
		 model.addAttribute("CustomerOrder",customerOrderService.listCustomerOrder());
		 return "/customerorderview/list";
	}

}

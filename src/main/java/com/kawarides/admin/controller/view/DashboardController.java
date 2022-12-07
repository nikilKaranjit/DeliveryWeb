package com.kawarides.admin.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/default")
public class DashboardController {

	@GetMapping("/login")
	public String login(Model model,String error,String logout){
		if(error!=null){
			model.addAttribute("error","USERNAME or PASSWORD is INVALID");
		}
		
		if(logout!=null){
			model.addAttribute("logout","you have logged out  succesfully");
		}
		return"/default/login";
	}
	
}

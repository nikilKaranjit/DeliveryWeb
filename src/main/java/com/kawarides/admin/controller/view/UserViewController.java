package com.kawarides.admin.controller.view;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kawarides.admin.model.User;
import com.kawarides.admin.service.RoleService;
import com.kawarides.admin.service.UserService;

@Controller
@RequestMapping("/userview")
public class UserViewController {

	
	private UserService userService;
	private RoleService roleService;
	
	@Autowired
	public UserViewController(UserService userService,RoleService roleService) {
	this.userService = userService;
	this.roleService=roleService;
	}

	

	    @GetMapping("/list")
	    public String userList(Model model){
		model.addAttribute("User",userService.userList());
	    return "/userview/list"; 
	}
	    @GetMapping(value="/form")
	    public String insertform(User user,Model model){
	    	model.addAttribute("user",new User());
	    	model.addAttribute("roles",roleService.roleList());
			return "/userview/userForm";
	    	
	    }
	    @GetMapping(value="/updateform/{userId}")
	    public String updateUser(@PathVariable Long userId,Model model,User user){
	    	model.addAttribute("user",userService.findOne(userId));
	    	model.addAttribute("roles",roleService.roleList());
			return "/userview/userUpdate";
	    	
	    }
	    
	    @RequestMapping("/deleteuser/{userId}")
	    public String deleteUser(@PathVariable Long userId){
	    	userService.deleteUser(userId);
	    	return "redirect:/userview/list";
	    }
	    
	    @PostMapping(value="/save")
	    public String saveUser(@ModelAttribute ("user") User user){
	    	userService.addUser(user);
	    	return "redirect:/userview/list";
	    }
}


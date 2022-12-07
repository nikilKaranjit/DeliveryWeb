package com.kawarides.admin.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kawarides.admin.model.User;
import com.kawarides.admin.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	public UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/list")
	public List <User> userList(){
		return userService.userList();
	}
	 
	@RequestMapping("/list/{userId}")
	public User findOne(@PathVariable Long userId){
	  return userService.findOne(userId);	
	}
	
	@RequestMapping("/add")
	public User addUser(@RequestBody  User user){
		return userService.addUser(user);
	}
	
	@RequestMapping("/delete/{userId}")
	public String deleteUser(@PathVariable Long userId){
		return userService.deleteUser(userId);
	}
	
}

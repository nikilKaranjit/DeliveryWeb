package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.User;
import com.kawarides.admin.repository.RoleRepository;
import com.kawarides.admin.repository.UserRepository;
import com.kawarides.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository ,RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.roleRepository= roleRepository;
	}

	@Override
	public List<User> userList() {
	  return userRepository.findAll();
	}

	@Override
	public User findOne(Long userId) {
		return userRepository.findOne(userId);
	}

	@Override
	public User addUser(User user) {
	    user.setRole(roleRepository.findOne(user.getRole().getRoleId()));
		return userRepository.save(user);
	}

	@Override
	public String deleteUser(Long userId) {
		userRepository.delete(userId);
		return "{'message':User has been Deleted}";
	}

	
}

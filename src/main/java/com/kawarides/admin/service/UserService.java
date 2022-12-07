package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.User;

public interface UserService {
	List<User>userList();
	User findOne(Long userId);
	User addUser(User user);
	String deleteUser(Long userId);
	

}

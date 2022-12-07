package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.Role;

public interface RoleService {

	List<Role> roleList();
	Role findOne(Long roleId);
	Role AddRole(Role role);
	String deleteRole(Long roleId);
}

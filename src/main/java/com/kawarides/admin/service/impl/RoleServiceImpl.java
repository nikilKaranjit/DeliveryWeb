package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.Role;
import com.kawarides.admin.repository.RoleRepository;
import com.kawarides.admin.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;
	
	
	@Autowired
	public RoleServiceImpl(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Role> roleList() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long roleId) {
		// TODO Auto-generated method stub
		return roleRepository.findOne(roleId);
	}

	@Override
	public Role AddRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}
//this is not programmed wait ......
	@Override
	public String deleteRole(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}

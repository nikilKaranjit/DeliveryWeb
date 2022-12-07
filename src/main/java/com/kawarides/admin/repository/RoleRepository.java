package com.kawarides.admin.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kawarides.admin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	

}

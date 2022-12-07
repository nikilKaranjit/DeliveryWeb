package com.kawarides.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kawarides.admin.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {

	@Query("FROM User WHERE username=:username")
	User findUserByName(@Param("username")String username);
	
}

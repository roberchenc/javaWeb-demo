package com.ccl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccl.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUserName(String userName);

}

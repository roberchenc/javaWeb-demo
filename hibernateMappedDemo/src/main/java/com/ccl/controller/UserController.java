package com.ccl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccl.entity.User;
import com.ccl.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/getuser")
	public User getUser() {
		return userRepository.findAll().get(0);
	}

	@RequestMapping("/adduser")
	public User addUser() {

		User tempu = new User();
		tempu.setUserName("1");
		tempu.setPassWord("***");
		return userRepository.save(tempu);

	}

}

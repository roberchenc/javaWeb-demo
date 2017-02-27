package com.ccl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ccl.entity.Users;

@Controller
public class HomeController {

	@RequestMapping("/register")
	public String register(){
		//System.out.println("hellominuib");
		return "register";
	}
	
	@RequestMapping("/login")
	public String login(){
		//System.out.println("hellominuib");
		return "login";
	}
	
	@RequestMapping("/index")
	public String index(){
		//System.out.println("hellominuib"); 
		
		
		return "index";
	}
	
	

}

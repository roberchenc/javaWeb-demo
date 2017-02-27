package com.ccl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccl.entity.Users;
import com.ccl.exception.UsersException;
import com.ccl.reponse.UsersResponse;
import com.ccl.service.UsersService;
import com.ccl.util.ExceptionCode;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService userService ;
	
	@RequestMapping(value="/adduser", method = RequestMethod.POST)
	public UsersResponse addUsers(@RequestBody Users users) throws UsersException{  //
		if(users != null){
			users.setLevel(1);
			System.out.println(users.toString());
			userService.addUser(users);
		}
		return new UsersResponse(ExceptionCode.Success ,users);
	}

	
	@RequestMapping(value="/getuser")
	public UsersResponse getUsers(String userName) throws UsersException{
		
		Users users =new Users();
		users.setUserName(userName);
		if(users.getUserName() != null)
			return new UsersResponse(ExceptionCode.Success ,userService.getUser(users.getUserName()));
		else
			return new UsersResponse(ExceptionCode.Success ,users);
		//return "failed";
	}
	
	@RequestMapping(value="/updateuser")
	public UsersResponse updateUsers(@RequestBody Users users) throws UsersException{
		
		if(users != null)
			userService.updateUser(users);
			
		return new UsersResponse(ExceptionCode.Success ,users);
		
	}
	
	@RequestMapping("/login.do")
	public UsersResponse loginDo(@RequestBody Users users) throws UsersException{
		
        //System.out.println(users.toString());
        if(userService.doLogin(users.getUserNumber(), users.getPassWord())){
        	
        }
        else
        	return new UsersResponse(ExceptionCode.Permission_Denied,null);
        
        return new UsersResponse(ExceptionCode.Success,users);
	}
	
}
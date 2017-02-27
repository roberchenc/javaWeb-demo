package com.umis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umis.Entity.User;
import com.umis.Repository.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public User addUser(String name , String age) {//@RequestBody User user
		 User u = new User();
		 //u=user;
		 //u.setId((long) 3);
		 u.setAge(Integer.valueOf(age));
		 u.setName(name);
		 userRepository.save(u);
        return u;
    }
	 
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public User getUser() {
		User u = new User();
		 
		u=userRepository.findUser("name");
        return u;
	}
	
	

    
	

}

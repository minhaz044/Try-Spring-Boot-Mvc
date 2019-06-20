package com.api.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Dao.UserRepository;
import com.Model.User;

@RestController
@RequestMapping("/api")
public class IonginController {
	@Autowired
	private UserRepository userRepository;
	@RequestMapping(value="/login",method=RequestMethod.POST)
	protected boolean login(@RequestBody User user) {
		for(User u:userRepository.findAll()) {
			if( u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword()) ) {
				return true;
			}
		}
		return false;
	}
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	protected User signUp(@RequestBody User user) {
		return userRepository.save(user);
	}
	

}

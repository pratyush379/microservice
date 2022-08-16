package com.pratyush.userservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pratyush.userservice.entity.User;
import com.pratyush.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate; 
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
	   User user = this.userService.getUser(userId);
	   
	  List contacts =  this.restTemplate.getForObject("http://contact-service/contacts/user/" + user.getUserId(), List.class);
	  user.setContacts(contacts); 
	  return user;
	}
	
	@GetMapping("/all")
	public List<User> getAllUser() {
	   List<User> user = this.userService.getAllUser();
	   List<User> userAll = new ArrayList<>() ;
	   for(int i=0;i<user.size();i++) {
	   List contacts =  this.restTemplate.getForObject("http://contact-service/contacts/user/" + user.get(i).getUserId(), List.class);
		User user2 = user.get(i);
		user2.setContacts(contacts);
		userAll.add(user2);
	   }
	  return user;
	}
	
}

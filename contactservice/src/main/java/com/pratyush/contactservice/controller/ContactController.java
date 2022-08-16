package com.pratyush.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratyush.contactservice.entity.Contact;
import com.pratyush.contactservice.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService ;

	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		return this.contactService.getContactsOfUser(userId);
	}
}

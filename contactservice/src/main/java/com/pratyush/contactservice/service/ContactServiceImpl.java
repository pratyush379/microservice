package com.pratyush.contactservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pratyush.contactservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	
	List<Contact> list = Arrays.asList(new Contact(1L,"Pratyush@gmail.com","Pratyush",101L),new Contact(2L,"rajarshi@gmail.com","Rajarshi",101L),new Contact(1L,"raj@gmail.com","Raj",102L),new Contact(2L,"Pratyush@gmail.com","Pratyush",102L),new Contact(3L,"adi@gmail.com","adi",102L),new Contact(5L,"ram@gmail.com","Ram",102L));
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}

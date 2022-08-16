package com.pratyush.userservice.entity;

import java.util.ArrayList;
import java.util.List;
import com.pratyush.userservice.entity.Contact;

public class User {

	private Long userId;
	private String name;
	private String phone;
	List<Contact> contacts = new ArrayList<>();
	public User(Long userId, String name, String phone) {
		//super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	public User(Long userId, String name, String phone, List<Contact> contacts) {
		//super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	
	public User() {}
//	public User(long userId2, String name2, String phone2) {
//		// TODO Auto-generated constructor stub
//	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}

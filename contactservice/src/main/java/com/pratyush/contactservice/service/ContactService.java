package com.pratyush.contactservice.service;

import java.util.List;

import com.pratyush.contactservice.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
}

package com.zohocrm3.services;

import java.util.List;

import com.zohocrm3.entities.Contact;
import com.zohocrm3.entities.Lead;

public interface ContactService {
	
	
	public void saveContact(Contact contact);
	public List<Contact> findAllContacts();
	public Contact getContact(long id);
	}

package com.zohocrm3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm3.entities.Contact;
import com.zohocrm3.entities.Lead;
import com.zohocrm3.repositeries.ContactRepository;
import com.zohocrm3.repositeries.LeadRepository;

@Service
public class ContactServiceimpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContact(long id) {
		Contact contact = contactRepo.getById(id);
		return contact;
	}
	
	 
	}

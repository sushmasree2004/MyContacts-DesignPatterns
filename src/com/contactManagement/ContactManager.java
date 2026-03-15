package com.contactManagement;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements ContactSubject 
{
	private List<Contact> contacts = new ArrayList<>();
	private List<ContactObserver> observers = new ArrayList<>();

	public void addContact(Contact contact) 
	{
		contacts.add(contact);
	}

	public void deleteContact(Contact contact, boolean confirm) 
	{
		if (confirm) 
		{
			contacts.remove(contact);
			notifyObservers(contact);
		} 
		else 
		{
			System.out.println("Deletion cancelled for: " + contact.getName());
		}
	}

	@Override
	public void addObserver(ContactObserver observer)
	{
		observers.add(observer);
	}

	@Override
	public void removeObserver(ContactObserver observer) 
	{
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(Contact contact) 
	{
		for (ContactObserver observer : observers) 
		{
			observer.onContactDeleted(contact);
		}
	}

	public List<Contact> getContacts() 
	{
		return contacts;
	}
}

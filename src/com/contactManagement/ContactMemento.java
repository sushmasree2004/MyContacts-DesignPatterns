package com.contactManagement;

import java.util.List;

public class ContactMemento 
{
	private final String name;
	private final List<PhoneNumber> phoneNumbers;
	private final List<Email> emails;

	public ContactMemento(String name, List<PhoneNumber> phoneNumbers, List<Email> emails)
	{
		this.name = name;
		this.phoneNumbers = List.copyOf(phoneNumbers); // defensive copy
		this.emails = List.copyOf(emails);
	}

	public String getName() { return name; }
	public List<PhoneNumber> getPhoneNumbers() { return phoneNumbers; }
	public List<Email> getEmails() { return emails; }
}

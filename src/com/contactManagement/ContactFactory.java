package com.contactManagement;

import java.util.List;

public class ContactFactory 
{
	public static Contact createContact(String type, String name, List<PhoneNumber> phones, List<Email> emails, String extra) 
	{
		switch(type.toLowerCase()) 
		{
		case "organization":
			return new Organization(name, phones, emails, extra);
		default:
			return new Person(name, phones, emails, extra);
		}
	}
}

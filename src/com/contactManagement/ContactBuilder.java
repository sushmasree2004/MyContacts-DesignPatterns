package com.contactManagement;

import java.util.ArrayList;
import java.util.List;

public class ContactBuilder
{
	private String name;
	private List<PhoneNumber> phones = new ArrayList<>();
	private List<Email> emails = new ArrayList<>();
	private String extra;
	private String type = "person";

	public ContactBuilder setName(String name) 
	{
		this.name = name;
		return this;
	}

	public ContactBuilder addPhone(String number)
	{
		this.phones.add(new PhoneNumber(number));
		return this;
	}

	public ContactBuilder addEmail(String address) 
	{
		this.emails.add(new Email(address));
		return this;
	}

	public ContactBuilder setExtra(String extra) 

	{
		this.extra = extra;
		return this;
	}

	public ContactBuilder setType(String type) {
		this.type = type;
		return this;
	}

	public Contact build() 
	{
		return ContactFactory.createContact(type, name, phones, emails, extra);
	}
}

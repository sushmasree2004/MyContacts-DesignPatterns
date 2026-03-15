package com.contactManagement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public abstract class Contact 
{
	private UUID id;
	private String name;
	private List<PhoneNumber> phoneNumbers;
	private List<Email> emails;
	private LocalDateTime createdAt;

	protected Contact(String name, List<PhoneNumber> phoneNumbers, List<Email> emails) 
	{
		this.id = UUID.randomUUID();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.emails = emails;
		this.createdAt = LocalDateTime.now();
	}

	public UUID getId() { return id; }
	public String getName() { return name; }
	public List<PhoneNumber> getPhoneNumbers() { return phoneNumbers; }
	public List<Email> getEmails() { return emails; }
	public LocalDateTime getCreatedAt() { return createdAt; }

	@Override
	public String toString() 
	{
		return "Contact: " + name + " | Phones: " + phoneNumbers + " | Emails: " + emails;
	}
}

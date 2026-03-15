package com.contactSearch;
import com.contactManagement.Contact;


import java.util.function.Predicate;

public class EmailCriteria implements SearchCriteria
{
	private String email;

	public EmailCriteria(String email) 
	{
		this.email = email;
	}

	@Override
	public Predicate<Contact> toPredicate() 
	{
		return c -> c.getEmails().stream()
				.anyMatch(e -> e.getAddress().toLowerCase().contains(email.toLowerCase()));
	}
}

package com.contactSearch;
import com.contactManagement.Contact;


import java.util.function.Predicate;

public class PhoneCriteria implements SearchCriteria
{
	private String phone;

	public PhoneCriteria(String phone) 
	{
		this.phone = phone;
	}

	@Override
	public Predicate<Contact> toPredicate() 
	{
		return c -> c.getPhoneNumbers().stream()
				.anyMatch(p -> p.getNumber().contains(phone));
	}
}

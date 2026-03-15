package com.contactSearch;

import java.util.List;
import java.util.stream.Collectors;
import com.contactManagement.Contact;

public class TagSearchHandler extends SearchHandler 
{
	@Override
	public List<Contact> handle(List<Contact> contacts, String query) 
	{
		List<Contact> result = contacts.stream()
				.filter(c -> c.getTags().stream().anyMatch(t -> t.equalsIgnoreCase(query)))
				.collect(Collectors.toList());

		if (result.isEmpty() && next != null) 
		{
			return next.handle(contacts, query);
		}
		return result;
	}
}

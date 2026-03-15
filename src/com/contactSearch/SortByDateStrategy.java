package com.contactSearch;


import com.contactManagement.Contact;
import java.util.List;
import java.util.stream.Collectors;

public class SortByDateStrategy implements FilterStrategy 
{
	@Override
	public List<Contact> sort(List<Contact> contacts)
	{
		return contacts.stream()
				.sorted((c1, c2) -> c1.getCreatedAt().compareTo(c2.getCreatedAt()))
				.collect(Collectors.toList());
	}
}

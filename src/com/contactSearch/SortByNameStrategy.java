package com.contactSearch;



import com.contactManagement.Contact;
import java.util.List;
import java.util.stream.Collectors;

public class SortByNameStrategy implements FilterStrategy {
	@Override
	public List<Contact> sort(List<Contact> contacts) 
	{
		return contacts.stream()
				.sorted((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()))
				.collect(Collectors.toList());
	}
}

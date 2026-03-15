package com.contactSearch;


import com.contactManagement.Contact;
import java.util.List;
import java.util.stream.Collectors;

public class SortByFrequencyStrategy implements FilterStrategy 
{
	@Override
	public List<Contact> sort(List<Contact> contacts) 
	{
		return contacts.stream()
				.sorted((c1, c2) -> Integer.compare(c2.getFrequency(), c1.getFrequency()))
				.collect(Collectors.toList());
	}
}

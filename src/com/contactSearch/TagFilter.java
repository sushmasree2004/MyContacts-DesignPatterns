package com.contactSearch;



import com.contactManagement.Contact;
import java.util.List;
import java.util.stream.Collectors;

public class TagFilter implements Filter
{
	private String tag;

	public TagFilter(String tag) 
	{
		this.tag = tag.toLowerCase();
	}

	@Override
	public List<Contact> apply(List<Contact> contacts)
	{
		return contacts.stream()
				.filter(c -> c.getTags().stream().anyMatch(t -> t.equalsIgnoreCase(tag)))
				.collect(Collectors.toList());
	}
}

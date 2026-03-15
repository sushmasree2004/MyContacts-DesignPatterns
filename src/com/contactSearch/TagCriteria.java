package com.contactSearch;

import java.util.function.Predicate;
import com.contactManagement.Contact;

public class TagCriteria implements SearchCriteria 
{
	private String tag;

	public TagCriteria(String tag) 
	{
		this.tag = tag.toLowerCase();
	}

	@Override
	public Predicate<Contact> toPredicate()
	{
		return c -> c.getTags().stream()
				.anyMatch(t -> t.equalsIgnoreCase(tag));
	}
}

package com.contactSearch;
import com.contactManagement.Contact;


import java.util.List;

public abstract class SearchHandler 
{
	protected SearchHandler next;

	public void setNext(SearchHandler next) 
	{
		this.next = next;
	}

	public abstract List<Contact> handle(List<Contact> contacts, String query);
}

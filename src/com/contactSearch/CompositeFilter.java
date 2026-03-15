package com.contactSearch;



import com.contactManagement.Contact;
import java.util.List;

public class CompositeFilter implements Filter 
{
	private List<Filter> filters;

	public CompositeFilter(List<Filter> filters) 
	{
		this.filters = filters;
	}

	@Override
	public List<Contact> apply(List<Contact> contacts) 
	{
		List<Contact> result = contacts;
		for (Filter f : filters) 
		{
			result = f.apply(result);
		}
		return result;
	}
}

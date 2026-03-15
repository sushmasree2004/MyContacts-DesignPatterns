package com.contactSearch;



import com.contactManagement.Contact;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyFilter implements Filter 
{
	private int minFrequency;

	public FrequencyFilter(int minFrequency) 
	{
		this.minFrequency = minFrequency;
	}

	@Override
	public List<Contact> apply(List<Contact> contacts) 
	{
		return contacts.stream()
				.filter(c -> c.getFrequency() >= minFrequency)
				.collect(Collectors.toList());
	}
}


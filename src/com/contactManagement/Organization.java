package com.contactManagement;

import java.util.List;

public class Organization extends Contact 
{
	private String industry;

	public Organization(String name, List<PhoneNumber> phoneNumbers, List<Email> emails,
			List<String> tags, String industry) 
	{
		super(name, phoneNumbers, emails, tags);
		this.industry = industry;
	}

	public String getIndustry() 
	{
		return industry;
	}

	public void setIndustry(String industry) 
	{
		this.industry = industry;
	}

	@Override
	public String toString() 
	{
		return super.toString() + " | Industry: " + industry;
	}
}

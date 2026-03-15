package com.contactManagement;

import java.util.List;

public class Organization extends Contact 
{
	private String industry;

	public Organization(String name, List<PhoneNumber> phoneNumbers, List<Email> emails, String industry)
	{
		super(name, phoneNumbers, emails);
		this.industry = industry;
	}

	public String getIndustry() { return industry; }

	@Override
	public String toString() 
	{
		return super.toString() + " | Industry: " + industry;
	}
}

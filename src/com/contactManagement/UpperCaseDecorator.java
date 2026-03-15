package com.contactManagement;

public class UpperCaseDecorator extends ContactDecorator 
{
	public UpperCaseDecorator(Contact contact) 
	{
		super(contact);
	}

	@Override
	public String toString() 
	{
		return decoratedContact.toString().toUpperCase();
	}
}

package com.contactManagement;

public abstract class ContactDecorator extends Contact 
{
	protected Contact decoratedContact;

	public ContactDecorator(Contact contact) 
	{
		super(contact.getName(), contact.getPhoneNumbers(), contact.getEmails());
		this.decoratedContact = contact;
	}

	@Override
	public String toString() 
	{
		return decoratedContact.toString();
	}
}

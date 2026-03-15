package com.contactManagement;

public class SingleContact implements ContactComponent 
{
	private Contact contact;

	public SingleContact(Contact contact) 
	{
		this.contact = contact;
	}

	@Override
	public void delete()
	{
		System.out.println("Deleting contact: " + contact.getName());
	}

	@Override
	public void tag(String tag) 
	{
		System.out.println("Tagging contact: " + contact.getName() + " with tag: " + tag);
	}

	@Override
	public void export() 
	{
		System.out.println("Exporting contact: " + contact);
	}
}

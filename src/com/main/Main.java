package com.main;

import com.contactManagement.*;

public class Main 
{
	public static void main(String[] args) 
	{
		ContactManager manager = new ContactManager();
		manager.addObserver(new DeletionLogger()); 

		Contact contact1 = new ContactBuilder()
				.setName("Sushma")
				.addPhone("9876543210")
				.addEmail("sushma@example.com")
				.setExtra("Nickname: Sush")
				.setType("person")
				.build();

		manager.addContact(contact1);

		System.out.println("Contacts before deletion: " + manager.getContacts());

		// Delete with confirmation
		manager.deleteContact(contact1, true);

		System.out.println("Contacts after deletion: " + manager.getContacts());
	}
}

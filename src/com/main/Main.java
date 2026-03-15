package com.main;

import com.contactManagement.Contact;
import com.contactManagement.ContactBuilder;
import com.contactSearch.*;

import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		// Create sample contacts using builder
		Contact contact1 = new ContactBuilder()
				.setName("Sushma")
				.addPhone("9876543210")
				.addEmail("sushma@example.com")
				.setTags(List.of("VIP"))
				.setType("person")
				.setExtra("Nickname: Sush")
				.build();

		Contact contact2 = new ContactBuilder()
				.setName("TechCorp")
				.addPhone("0801234567")
				.addEmail("info@techcorp.com")
				.setTags(List.of("Business"))
				.setType("organization")
				.setExtra("Industry: IT")
				.build();

		List<Contact> contacts = List.of(contact1, contact2);

		//  Specification Pattern 
		System.out.println("Specification Pattern Search ");
		SearchCriteria criteria = new CompositeCriteria(
				List.of(new NameCriteria("Sushma"), new TagCriteria("VIP"))
				);
		List<Contact> specResult = contacts.stream()
				.filter(criteria.toPredicate())
				.toList();
		System.out.println("Result: " + specResult);

		// Chain of Responsibility 
		System.out.println("\nChain of Responsibility Search ");
		NameSearchHandler nameHandler = new NameSearchHandler();
		PhoneSearchHandler phoneHandler = new PhoneSearchHandler();
		EmailSearchHandler emailHandler = new EmailSearchHandler();
		TagSearchHandler tagHandler = new TagSearchHandler();

		// Chain setup
		nameHandler.setNext(phoneHandler);
		phoneHandler.setNext(emailHandler);
		emailHandler.setNext(tagHandler);

		System.out.println("Search by name 'TechCorp': " + nameHandler.handle(contacts, "TechCorp"));
		System.out.println("Search by phone '9876543210': " + nameHandler.handle(contacts, "9876543210"));
		System.out.println("Search by email 'info@techcorp.com': " + nameHandler.handle(contacts, "info@techcorp.com"));
		System.out.println("Search by tag 'VIP': " + nameHandler.handle(contacts, "VIP"));
	}
}

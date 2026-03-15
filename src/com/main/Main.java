package com.main;

import com.contactManagement.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Contact contact1 = new ContactBuilder()
				.setName("Sushma")
				.addPhone("9876543210")
				.addEmail("sushma@example.com")
				.setExtra("Nickname: Sush")
				.setType("person")
				.build();

		Contact contact2 = new ContactBuilder()
				.setName("TechCorp")
				.addPhone("0801234567")
				.addEmail("info@techcorp.com")
				.setExtra("IT Industry")
				.setType("organization")
				.build();

		System.out.println(contact1);
		System.out.println(contact2);
	}
}

package com.main;

import com.contactManagement.*;

public class Main 
{
	public static void main(String[] args)
	{
		Contact contact = new ContactBuilder()
				.setName("Sushma")
				.addPhone("9876543210")
				.addEmail("sushma@example.com")
				.setExtra("Nickname: Sush")
				.setType("person")
				.build();

		System.out.println("Original: " + contact);

		// Uppercase decorator
		Contact upperCaseContact = new UpperCaseDecorator(contact);
		System.out.println("Uppercase: " + upperCaseContact);

		// Masked email decorator
		Contact maskedEmailContact = new MaskedEmailDecorator(contact);
		System.out.println("Masked Email: " + maskedEmailContact);
	}
}

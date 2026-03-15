package com.contactManagement;

import java.util.stream.Collectors;

public class MaskedEmailDecorator extends ContactDecorator 
{
	public MaskedEmailDecorator(Contact contact)
	{
		super(contact);
	}

	@Override
	public String toString()
	{
		return "Contact: " + decoratedContact.getName() +
				" | Phones: " + decoratedContact.getPhoneNumbers() +
				" | Emails: " + decoratedContact.getEmails().stream()
				.map(email -> maskEmail(email.getAddress()))
				.collect(Collectors.toList());
	}

	private String maskEmail(String email) {
		int atIndex = email.indexOf("@");
		if (atIndex > 2) {
			return email.substring(0, 2) + "****" + email.substring(atIndex);
		}
		return "****" + email.substring(atIndex);
	}
}

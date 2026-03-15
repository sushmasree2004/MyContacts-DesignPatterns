package com.contactManagement;

import java.util.List;

public class Person extends Contact 
{
	private String nickname;

	public Person(String name, List<PhoneNumber> phoneNumbers, List<Email> emails, String nickname) 
	{
		super(name, phoneNumbers, emails);
		this.nickname = nickname;
	}

	public String getNickname() { return nickname; }

	@Override
	public String toString() 
	{
		return super.toString() + " | Nickname: " + nickname;
	}
}

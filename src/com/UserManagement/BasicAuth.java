package com.UserManagement;

import java.util.Optional;

public class BasicAuth implements Authentication 
{
	private User registeredUser;

	public BasicAuth(User registeredUser) 
	{
		this.registeredUser = registeredUser;
	}

	@Override
	public Optional<User> login(String email, String password) 
	{
		String hashed = Integer.toHexString(password.hashCode());

		if (registeredUser.getEmail().equals(email) &&
				registeredUser.getPasswordHash().equals(hashed)) 
		{
			return Optional.of(registeredUser);
		}
		return Optional.empty();
	}
}

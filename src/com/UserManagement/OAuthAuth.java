package com.UserManagement;

import java.util.Optional;

public class OAuthAuth implements Authentication 
{
	@Override
	public Optional<User> login(String email, String password) 
	{
		// Simulated OAuth flow
		if (email.endsWith("@gmail.com")) 
		{
			return Optional.of(new FreeUser(email, Integer.toHexString(password.hashCode()), "OAuthUser"));
		}
		return Optional.empty();
	}
}

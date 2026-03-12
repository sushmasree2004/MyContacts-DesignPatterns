package com.main;

import com.UserManagement.*;
import java.util.Optional;

public class Main {
	public static void main(String[] args) 
	{
		// Register user (UC1)
		User user1 = UserFactory.createUser("free", "sushma@example.com", Integer.toHexString("securePass123".hashCode()), "Sushma");

		// Authenticate with BasicAuth (UC2)
		Authentication auth = new BasicAuth(user1);
		Optional<User> loggedIn = auth.login("sushma@example.com", "securePass123");

		if (loggedIn.isPresent()) 
		{
			SessionManager.getInstance().setUser(loggedIn.get());
			System.out.println("Login successful! Current user: " + SessionManager.getInstance().getUser().getName());
		} 
		else 
		{
			System.out.println("Login failed. Invalid credentials.");
		}
	}
}

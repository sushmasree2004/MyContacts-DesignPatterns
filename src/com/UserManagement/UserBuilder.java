package com.UserManagement;


public class UserBuilder 
{
	private String email;
	private String passwordHash;
	private String name;
	private String type = "free";

	public UserBuilder setEmail(String email)
	{

		this.email = email;
		return this;
	}

	public UserBuilder setPassword(String password) 
	{
		this.passwordHash = Integer.toHexString(password.hashCode()); // simple hashing
		return this;
	}

	public UserBuilder setName(String name) 
	{
		this.name = name;
		return this;
	}

	public UserBuilder setType(String type) 
	{
		this.type = type;
		return this;
	}

	public User build() 
	{
		return UserFactory.createUser(type, email, passwordHash, name);
	}
}

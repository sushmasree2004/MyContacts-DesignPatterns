package com.UserManagement;



public abstract class User 
{
	private String email;
	private String passwordHash;
	private String name;

	protected User(String email, String passwordHash, String name) 
	{
		this.email = email;
		this.passwordHash = passwordHash;
		this.name = name;
	}

	public String getEmail() 
	{
		return email; 
	}

	public String getName() 
	{
		return name; 
	}


	public String getPasswordHash() 
	{
		return passwordHash; 
	}


}


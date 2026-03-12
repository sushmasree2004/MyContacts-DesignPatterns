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

	// Getters
	public String getEmail() 
	{
		return email; 
	}

	public String getPasswordHash() 
	{
		return passwordHash; 
	}

	public String getName() 
	{
		return name; }


	// Setters 
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setPasswordHash(String passwordHash) 
	{
		this.passwordHash = passwordHash;
	}
}

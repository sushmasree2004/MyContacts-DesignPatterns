package com.contactTags;

import java.util.Objects;

public class Tag 
{
	private final String name;

	private Tag(String name) 
	{
		if (name == null || name.trim().isEmpty()) 
		{
			throw new IllegalArgumentException("Tag name cannot be empty");
		}
		this.name = name.trim().toLowerCase(); // normalize
	}

	public static Tag of(String name) 
	{
		return new Tag(name);
	}

	public String getName() 
	{
		return name;
	}

	// equals & hashCode for uniqueness in Sets
	@Override
	public boolean equals(Object o) 
	{
		if (this == o) 
			return true;

		if (!(o instanceof Tag))
			return false;

		Tag tag = (Tag) o;
		return Objects.equals(name, tag.name);
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Tag: " + name;
	}
}

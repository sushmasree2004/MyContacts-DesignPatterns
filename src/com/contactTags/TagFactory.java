package com.contactTags;

import java.util.HashMap;
import java.util.Map;

public class TagFactory 
{
	private static final Map<String, Tag> tagPool = new HashMap<>();

	public static Tag getTag(String name) 
	{
		String key = name.trim().toLowerCase();

		if (!tagPool.containsKey(key)) 
		{
			tagPool.put(key, Tag.of(name));
			System.out.println("Created tag: " + name);
		}
		return tagPool.get(key);
	}
}

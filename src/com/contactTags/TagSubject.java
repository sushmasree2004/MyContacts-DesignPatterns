package com.contactTags;

import com.contactManagement.Contact;
import java.util.ArrayList;
import java.util.List;

public class TagSubject 
{
	private List<TagObserver> observers = new ArrayList<>();

	public void registerObserver(TagObserver observer) 
	{
		observers.add(observer);
	}

	public void removeObserver(TagObserver observer) 
	{
		observers.remove(observer);
	}

	protected void notifyTagApplied(Contact contact, Tag tag) 
	{
		for (TagObserver obs : observers)
		{
			obs.onTagApplied(contact, tag);
		}
	}

	protected void notifyTagRemoved(Contact contact, Tag tag)
	{
		for (TagObserver obs : observers) 
		{
			obs.onTagRemoved(contact, tag);
		}
	}
}

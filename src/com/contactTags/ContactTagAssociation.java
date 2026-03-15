package com.contactTags;

import com.contactManagement.Contact;
import java.util.*;

public class ContactTagAssociation extends TagSubject 
{
	private Map<Contact, Set<Tag>> contactTags = new HashMap<>();

	public void addTag1(Contact contact, Tag tag) 
	{
		contactTags.computeIfAbsent(contact, k -> new HashSet<>()).add(tag);
		notifyTagRemoved(contact, tag);
	}



	public void removeTag(Contact contact, Tag tag) 
	{
		if (contactTags.containsKey(contact)) 
		{
			contactTags.get(contact).remove(tag);
			notifyTagRemoved(contact, tag);
		}
	}

	public Set<Tag> getTags(Contact contact) 
	{
		return contactTags.getOrDefault(contact, Collections.emptySet());
	}

	public void addTag(Contact contact1, Tag familyTag) 
	{
		// TODO Auto-generated method stub

	}
}

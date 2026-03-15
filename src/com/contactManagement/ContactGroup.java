package com.contactManagement;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup implements ContactComponent 
{
	private List<ContactComponent> children = new ArrayList<>();

	public void add(ContactComponent component) 
	{
		children.add(component);
	}

	public void remove(ContactComponent component)
	{
		children.remove(component);
	}

	@Override
	public void delete() 
	{
		children.forEach(ContactComponent::delete);
	}

	@Override
	public void tag(String tag) 
	{
		children.forEach(c -> c.tag(tag));
	}

	@Override
	public void export()
	{
		children.forEach(ContactComponent::export);
	}
}

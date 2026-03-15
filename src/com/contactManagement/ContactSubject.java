package com.contactManagement;

public interface ContactSubject 
{
	void addObserver(ContactObserver observer);
	void removeObserver(ContactObserver observer);
	void notifyObservers(Contact contact);
}

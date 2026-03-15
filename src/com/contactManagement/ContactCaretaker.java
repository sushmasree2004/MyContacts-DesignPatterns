package com.contactManagement;

import java.util.Stack;

public class ContactCaretaker 
{
	private Stack<ContactMemento> history = new Stack<>();
	private Stack<ContactMemento> redoStack = new Stack<>();
	private Contact contact;

	public ContactCaretaker(Contact contact)
	{
		this.contact = contact;
	}

	public void saveState() 
	{
		history.push(new ContactMemento(contact.getName(), contact.getPhoneNumbers(), contact.getEmails()));
		redoStack.clear();
	}

	public void undo() 
	{
		if (!history.isEmpty()) 
		{
			ContactMemento memento = history.pop();
			redoStack.push(new ContactMemento(contact.getName(), contact.getPhoneNumbers(), contact.getEmails()));
			restore(memento);
		}
	}

	public void redo() {
		if (!redoStack.isEmpty()) {
			ContactMemento memento = redoStack.pop();
			history.push(new ContactMemento(contact.getName(), contact.getPhoneNumbers(), contact.getEmails()));
			restore(memento);
		}
	}

	private void restore(ContactMemento memento) {
		contact.setName(memento.getName());
		contact.setEmails(memento.getEmails());
		contact.setPhoneNumbers(memento.getPhoneNumbers());
	}
}

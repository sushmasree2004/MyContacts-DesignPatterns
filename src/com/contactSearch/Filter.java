package com.contactSearch;



import com.contactManagement.Contact;
import java.util.List;

public interface Filter 
{
	List<Contact> apply(List<Contact> contacts);
}

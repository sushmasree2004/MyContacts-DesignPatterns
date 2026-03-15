package com.contactSearch;



import com.contactManagement.Contact;
import java.util.List;

public interface FilterStrategy 
{
    List<Contact> sort(List<Contact> contacts);
}

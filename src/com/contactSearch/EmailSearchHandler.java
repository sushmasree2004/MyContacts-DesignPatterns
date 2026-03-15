package com.contactSearch;
import com.contactManagement.Contact;


import java.util.List;
import java.util.stream.Collectors;

public class EmailSearchHandler extends SearchHandler 
{
    @Override
    public List<Contact> handle(List<Contact> contacts, String query) 
    {
        List<Contact> result = contacts.stream()
                .filter(c -> c.getEmails().stream().anyMatch(e -> e.getAddress().toLowerCase().contains(query.toLowerCase())))
                .collect(Collectors.toList());

        if (result.isEmpty() && next != null) 
        {
            return next.handle(contacts, query);
        }
        return result;
    }
}

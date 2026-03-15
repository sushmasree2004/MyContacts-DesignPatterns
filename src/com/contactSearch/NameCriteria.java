package com.contactSearch;
import com.contactManagement.Contact;


import java.util.function.Predicate;

public class NameCriteria implements SearchCriteria
{
    private String name;

    public NameCriteria(String name) {
        this.name = name;
    }

    @Override
    public Predicate<Contact> toPredicate() 
    {
        return c -> c.getName().toLowerCase().contains(name.toLowerCase());
    }
}

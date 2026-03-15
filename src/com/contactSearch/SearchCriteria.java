package com.contactSearch;
import com.contactManagement.Contact;




import java.util.function.Predicate;

public interface SearchCriteria 
{
    Predicate<Contact> toPredicate();
}

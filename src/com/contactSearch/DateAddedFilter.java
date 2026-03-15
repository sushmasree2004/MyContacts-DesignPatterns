package com.contactSearch;



import com.contactManagement.Contact;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DateAddedFilter implements Filter 
{
    private LocalDateTime after;

    public DateAddedFilter(LocalDateTime after)
    {
        this.after = after;
    }

    @Override
    public List<Contact> apply(List<Contact> contacts)
    {
        return contacts.stream()
                .filter(c -> c.getCreatedAt().isAfter(after))
                .collect(Collectors.toList());
    }
}

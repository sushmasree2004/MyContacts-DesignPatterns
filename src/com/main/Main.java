package com.main;

import com.contactManagement.Contact;
import com.contactManagement.ContactBuilder;
import com.contactSearch.*;


import java.time.LocalDateTime;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        // Create sample contacts
        Contact contact1 = new ContactBuilder()
                .setName("Sushma")
                .addPhone("9876543210")
                .addEmail("sushma@example.com")
                .setTags(List.of("VIP"))
                .setType("person")
                .setExtra("Nickname: Sush")
                .build();
        contact1.setFrequency(10);

        Contact contact2 = new ContactBuilder()
                .setName("TechCorp")
                .addPhone("0801234567")
                .addEmail("info@techcorp.com")
                .setTags(List.of("Business"))
                .setType("organization")
                .setExtra("Industry: IT")
                .build();
        contact2.setFrequency(3);

        List<Contact> contacts = List.of(contact1, contact2);

        // Composite Filter 
        Filter tagFilter = new TagFilter("VIP");
        Filter dateFilter = new DateAddedFilter(LocalDateTime.now().minusDays(1));
        Filter frequencyFilter = new FrequencyFilter(5);

        CompositeFilter compositeFilter = new CompositeFilter(List.of(tagFilter, dateFilter, frequencyFilter));
        List<Contact> filtered = compositeFilter.apply(contacts);
        System.out.println("Filtered Contacts: " + filtered);

        // Strategy Pattern for Sorting 
        FilterStrategy sortByName = new SortByNameStrategy();
        FilterStrategy sortByDate = new SortByDateStrategy();
        FilterStrategy sortByFrequency = new SortByFrequencyStrategy();

        System.out.println("Sorted by Name: " + sortByName.sort(contacts));
        System.out.println("Sorted by Date: " + sortByDate.sort(contacts));
        System.out.println("Sorted by Frequency: " + sortByFrequency.sort(contacts));
    }
}

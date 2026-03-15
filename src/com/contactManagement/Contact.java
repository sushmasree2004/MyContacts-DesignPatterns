package com.contactManagement;

import java.util.List;
import java.util.UUID;
import java.time.LocalDateTime;

public abstract class Contact 
{
    private UUID id;
    private String name;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;
    private List<String> tags;   
    private LocalDateTime createdAt;

    protected Contact(String name, List<PhoneNumber> phoneNumbers, List<Email> emails, List<String> tags) 
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.tags = tags;        
        this.createdAt = LocalDateTime.now();
    }

    // Getters
    public String getName() { return name; }
    public List<PhoneNumber> getPhoneNumbers() { return phoneNumbers; }
    public List<Email> getEmails() { return emails; }
    public List<String> getTags() { return tags; } 

    // Setters
    public void setTags(List<String> tags) { this.tags = tags; }   

    @Override
    public String toString() 
    {
        return "Contact: " + name + " | Phones: " + phoneNumbers + " | Emails: " + emails + " | Tags: " + tags;
    }
}

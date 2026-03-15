package com.contactManagement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public abstract class Contact 
{
    private UUID id;
    private String name;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;
    private List<String> tags;
    private LocalDateTime createdAt;
    private int frequency;   // ✅ new field

    protected Contact(String name, List<PhoneNumber> phoneNumbers, List<Email> emails, List<String> tags) 
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.tags = tags;
        this.createdAt = LocalDateTime.now();
        this.frequency = 0;
    }

    public String getName() { return name; }
    public List<PhoneNumber> getPhoneNumbers() { return phoneNumbers; }
    public List<Email> getEmails() { return emails; }
    public List<String> getTags() { return tags; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    // frequency methods
    public int getFrequency() { return frequency; }
    public void setFrequency(int frequency) { this.frequency = frequency; }

    @Override
    public String toString() {
        return "Contact: " + name + " | Phones: " + phoneNumbers + " | Emails: " + emails + " | Tags: " + tags;
    }
}

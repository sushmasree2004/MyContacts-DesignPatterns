package com.contactManagement;

import java.util.ArrayList;
import java.util.List;

public class ContactBuilder {
    private String name;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private List<Email> emails = new ArrayList<>();
    private List<String> tags = new ArrayList<>();   // ✅ added tags
    private String extra;
    private String type;

    // Setters for builder
    public ContactBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder addPhone(String number) {
        this.phoneNumbers.add(new PhoneNumber(number));
        return this;
    }

    public ContactBuilder addEmail(String address) {
        this.emails.add(new Email(address));
        return this;
    }

    public ContactBuilder setTags(List<String> tags) {   // ✅ new method
        this.tags = tags;
        return this;
    }

    public ContactBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public ContactBuilder setType(String type) {
        this.type = type;
        return this;
    }

    // Build method
    public Contact build() {
        if (type == null) {
            throw new IllegalArgumentException("Contact type must be specified");
        }

        if (type.equalsIgnoreCase("person")) {
            return new Person(name, phoneNumbers, emails, tags, extra);
        } else if (type.equalsIgnoreCase("organization")) {
            return new Organization(name, phoneNumbers, emails, tags, extra);
        } else {
            throw new IllegalArgumentException("Unknown contact type: " + type);
        }
    }
}

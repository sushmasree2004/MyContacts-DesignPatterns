package com.main;

import com.contactManagement.Contact;
import com.contactManagement.ContactBuilder;
import com.contactTags.*;

import java.util.List;

public class Main  
{
    public static void main(String[] args) {
        // Create sample contacts
        Contact contact1 = new ContactBuilder()
                .setName("Sushma")
                .addPhone("9876543210")
                .addEmail("sushma@example.com")
                .setTags(List.of()) // start empty
                .setType("person")
                .setExtra("Nickname: Sush")
                .build();

        Contact contact2 = new ContactBuilder()
                .setName("TechCorp")
                .addPhone("0801234567")
                .addEmail("info@techcorp.com")
                .setTags(List.of()) // start empty
                .setType("organization")
                .setExtra("Industry: IT")
                .build();

        // Tag association manager
        ContactTagAssociation association = new ContactTagAssociation();

        // Register observer
        association.registerObserver(new TagObserver() {
            @Override
            public void onTagApplied(Contact contact, Tag tag) {
                System.out.println("Tag '" + tag.getName() + "' applied to contact: " + contact.getName());
            }

            @Override
            public void onTagRemoved(Contact contact, Tag tag) {
                System.out.println("Tag '" + tag.getName() + "' removed from contact: " + contact.getName());
            }
        });

        // Apply tags
        Tag familyTag = TagFactory.getTag("Family");
        Tag workTag = TagFactory.getTag("Work");

        association.addTag(contact1, familyTag);
        association.addTag(contact2, workTag);

        // Remove tag
        association.removeTag(contact2, workTag);

        // Show tags
        System.out.println("Tags for Sushma: " + association.getTags(contact1));
        System.out.println("Tags for TechCorp: " + association.getTags(contact2));
    }
}

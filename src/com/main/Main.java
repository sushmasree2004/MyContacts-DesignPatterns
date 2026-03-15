 package com.main;

import com.contactTags.*;

public class Main {
    public static void main(String[] args) {
        TagManager manager = new TagManager();

        // Create custom tags
        Tag familyTag = manager.createTag("Family");
        Tag workTag = manager.createTag("Work");
        Tag friendsTag = manager.createTag("Friends");

        // Use predefined tags
        Tag predefinedFamily = manager.getPredefinedTag(TagManager.PredefinedTag.FAMILY);

        System.out.println("All Tags: " + manager.getTags());
        System.out.println("Predefined Tag: " + predefinedFamily);
    }
}

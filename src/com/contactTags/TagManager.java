package com.contactTags;

import java.util.HashSet;
import java.util.Set;

public class TagManager {
    // Predefined tags as an enum
    public enum PredefinedTag {
        FAMILY, WORK, FRIENDS
    }

    private Set<Tag> tags;

    public TagManager() {
        this.tags = new HashSet<>();   // ✅ use HashSet instead of EnumSet
    }

    public Tag createTag(String name) {
        Tag tag = TagFactory.getTag(name);
        tags.add(tag);
        return tag;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public Tag getPredefinedTag(PredefinedTag predefined) {
        return TagFactory.getTag(predefined.name());
    }
}

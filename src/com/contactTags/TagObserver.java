package com.contactTags;

import com.contactManagement.Contact;

public interface TagObserver 
{
    void onTagApplied(Contact contact, Tag tag);
    void onTagRemoved(Contact contact, Tag tag);
}

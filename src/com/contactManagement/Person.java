package com.contactManagement;

import java.util.List;

public class Person extends Contact 
{
    private String nickname;

    public Person(String name, List<PhoneNumber> phoneNumbers, List<Email> emails,
                  List<String> tags, String nickname) 
    {
        super(name, phoneNumbers, emails, tags);
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }

    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | Nickname: " + nickname;
    }
}

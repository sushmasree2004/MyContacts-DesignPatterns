package com.main;

import com.contactManagement.*;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        Contact contact = new ContactBuilder()
                .setName("Sushma")
                .addPhone("9876543210")
                .addEmail("sushma@example.com")
                .setExtra("Nickname: Sush")
                .setType("person")
                .build();

        System.out.println("Original: " + contact);

        ContactCaretaker caretaker = new ContactCaretaker(contact);

        // Save initial state
        caretaker.saveState();

        // Change name
        EditCommand changeName = new ChangeContactNameCommand(contact, "Sushma R");
        changeName.execute();
        System.out.println("After name change: " + contact);

        // Undo
        caretaker.undo();
        System.out.println("After undo: " + contact);

        // Redo
        caretaker.redo();
        System.out.println("After redo: " + contact);

        // Change email
        caretaker.saveState();
        EditCommand changeEmail = new ChangeContactEmailCommand(contact, List.of(new Email("newmail@example.com")));
        changeEmail.execute();
        System.out.println("After email change: " + contact);

        caretaker.undo();
        System.out.println("After undo email: " + contact);
    }
}

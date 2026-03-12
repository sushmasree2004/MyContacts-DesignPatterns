package com.main;

import com.UserManagement.*;

public class Main {
    public static void main(String[] args) {
        // Using the factory to create users
        User user1 = UserFactory.createUser("free", "sushma@example.com", "hashedPass123", "Sushma");
        User user2 = UserFactory.createUser("premium", "raj@example.com", "hashedPass456", "Raj");

        System.out.println("Registered: " + user1.getName() + " (" + user1.getEmail() + ")");
        System.out.println("Registered: " + user2.getName() + " (" + user2.getEmail() + ")");
    }
}

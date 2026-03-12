package com.main;

import com.UserManagement.*;

public class Main 
{
    public static void main(String[] args) 
    {
        // UC1: Register user
        User user = UserFactory.createUser("free", "sushma@example.com", Integer.toHexString("securePass123".hashCode()), "Sushma");

        // UC2: Authenticate
        Authentication auth = new BasicAuth(user);
        if (auth.login("sushma@example.com", "securePass123").isPresent()) 
        {
            SessionManager.getInstance().setUser(user);
            System.out.println("Login successful! \n Current user: " + user.getName());
        }

        
        // UC3: Profile Management (Command Pattern)
        CommandManager manager = new CommandManager();

        
        // Change name
        ProfileUpdateCommand changeName = new ChangeNameCommand(user, "Sushma R");
        manager.executeCommand(changeName);
        System.out.println("Updated name: " + user.getName());
        

        // Undo change
        manager.undo();
        System.out.println("After undo: " + user.getName());

        // Redo change
        manager.redo();
        System.out.println("After redo: " + user.getName());

        // Change password
        ProfileUpdateCommand changePassword = new ChangePasswordCommand(user, "newSecurePass456");
        manager.executeCommand(changePassword);
        System.out.println("Password updated for user: " + user.getEmail());
    }
}

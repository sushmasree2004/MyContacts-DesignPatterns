package com.UserManagement;

public class UserFactory {
    public static User createUser(String type, String email, String passwordHash, String name) {
        switch(type.toLowerCase()) {
            case "premium":
                return new PremiumUser(email, passwordHash, name);
            case "free":
            default:
                return new FreeUser(email, passwordHash, name);
        }
    }
}

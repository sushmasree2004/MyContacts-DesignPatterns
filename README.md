

UC11 – Create and Manage Tags

UC11 introduces tag creation and management in the MyContacts App.
It allows logged-in users to create custom tags (e.g., Family, Work, Friends) to organize contacts.
This use case demonstrates validation, uniqueness, and efficient tag sharing using the Flyweight Pattern.

Features

Create custom tags with validation (no empty names, no duplicates).
Many-to-many relationship between Contact and Tag.
Support for predefined tags (Family, Work, Friends) via an enum.
Use of Java Set for uniqueness.
Proper equals() and hashCode() implementation for tag comparison.

Version : 11
Author : B.Sushma Sree
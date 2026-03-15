Overview

MyContactsPatterns is a Java-based contact management application that 
demonstrates advanced object-oriented design and multiple design patterns.
It provides a complete workflow for managing contacts, searching, filtering, exporting, bulk operations, and tagging.




Features

User Accounts

Register and log in securely.
Manage sessions and access personal contact lists.

Contact Management
Create new contacts with flexible fields (names, phones, emails, nicknames, industries).
Edit or delete existing contacts.
View all contacts in a structured list.

Tagging System

Create and manage custom tags (e.g., Family, Work, Friends).
Apply one or multiple tags to contacts.
Remove tags when needed.
Predefined tags available for quick organization.
Shared tag instances ensure efficiency.



Search & Filtering

Search contacts by name, phone, email, or tags.
Combine multiple search criteria.
Apply advanced filters (by tag, date added, frequency).
Sort results by name, date, or frequency.

Bulk Operations

Perform batch actions on multiple contacts at once.
Tagging, exporting, or deleting in bulk.
Undo/redo support for safe operations.


Architecture Highlights

Builder Pattern → Flexible contact creation.
Decorator Pattern → Dynamic tagging.
Strategy Pattern → Export formats & sorting strategies.
Command Pattern → Bulk operations with undo/redo.
Specification Pattern → Flexible search criteria.
Chain of Responsibility → Sequential search pipeline.
Composite Pattern → Multi-level filtering.
Flyweight Pattern → Shared tag instances.
Observer Pattern → UI updates when tags change.
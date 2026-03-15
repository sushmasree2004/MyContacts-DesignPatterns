Overview

UC7 implements Contact Deletion for the MyContacts App.
It allows logged-in users to remove a contact from their list with confirmation.
This use case demonstrates lifecycle management and 
uses the Observer Pattern to notify other components when a contact is deleted.

Features

Delete contacts with confirmation (soft delete vs hard delete).
Notify observers (e.g., logging, UI refresh) when a contact is deleted.
Encapsulation of deletion logic in ContactManager.
Exception handling for cancelled or invalid deletions.
Extensible observer system for multiple listeners.

Version : 7
Author : B.Sushma Sree
Overview

UC10 implements Advanced Filtering for the MyContacts App.
It allows logged-in users to apply multiple filters (by tag, date added, frequency of contact) 
sort results using different strategies.
This use case demonstrates multi-level filtering with the Composite Pattern 
and flexible sorting with the Strategy Pattern.

Features

Filter contacts by:
Tag (e.g., VIP, Business).
Date added (contacts created after a given date).
Frequency (contacts interacted with more than N times).
Combine multiple filters with CompositeFilter.
Sort results using different strategies:

By name.
By date added.
By frequency.

Extensible design: new filters and sorting strategies can be added easily.

Version : 10
Author : B.Sushma Sree
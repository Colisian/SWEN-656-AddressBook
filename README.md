# SWEN-656-AddressBook

**Overview**

The AddressBook system is a simple Java application designed to manage contacts in an address book. It allows users to add, update, and delete contacts, as well as search for contacts by name. 
The system is built using the AspectJ framework, which enables the implementation of aspect-oriented programming (AOP) concepts.

# Features

The AddressBook system offers the following features:
- Adding a new contact: Users can add a new contact by providing their name, address, phone number, and email.
- Updating a contact: Existing contacts can be updated with new information, such as a changed address or phone number.
- Deleting a contact: Users can remove a contact from the address book.
- Searching for a contact: The system provides search functionality to find contacts by name.
- Persistence: Contacts are stored in a file to ensure data persistence across multiple program executions.
- Aspect-Oriented Programming: The system leverages AspectJ to implement cross-cutting concerns, such as logging and file writing, using aspect-oriented concepts.

# AspectJ and AOP
AspectJ is a powerful extension of the Java programming language that enables developers to apply aspect-oriented programming techniques. AOP aims to modularize cross-cutting concerns, which are functionalities that cut across multiple modules or components of an application. In the AddressBook system, AspectJ is used to separate the concerns of logging and file writing from the core business logic of managing contacts.

The AddressBookAspect class in the system serves as an aspect that intercepts certain method calls in the AddressBook class. It uses pointcuts to define specific join points where the aspect's behavior should be applied. For example, the aspect intercepts the updateContact and deleteContact methods in the AddressBook class to write the updated or deleted contact information to a file.

By utilizing AspectJ, the AddressBook system achieves a clean separation of concerns, making it easier to maintain and enhance the application. It also allows for the reusability of cross-cutting functionalities across different parts of the system.

# Running
1. Ensure you have Java and AspectJ installed on your machine.
2. Clone the project repository from GitHub.
3. Open the project in your preferred Java IDE.
4. Build and compile the project to ensure all dependencies are resolved.
5. Run the AddressBookApp class, which serves as the entry point of the application.
6. Follow the on-screen instructions to interact with the AddressBook system and manage contacts.

# Future Enhancements
The AddressBook system can be further enhanced with additional features and improvements:

- User interface: Develop a graphical user interface (GUI) to provide a more intuitive and user-friendly experience.
- Sorting and filtering: Implement sorting and filtering options to organize and search contacts based on different criteria.
- Data validation: Enhance input validation to ensure the integrity and accuracy of contact information.
- Import/export functionality: Enable importing and exporting contacts from/to different file formats, such as CSV or Excel.

# Conclusion
The AddressBook system demonstrates the application of AspectJ and aspect-oriented programming concepts to manage contacts in an address book. By leveraging AspectJ, the system achieves a modular and extensible design, allowing for the separation of concerns and the reuse of cross-cutting functionalities. With its user-friendly features and persistence capabilities, the AddressBook system provides a practical solution for managing personal contacts efficiently.


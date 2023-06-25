package org.example;


import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        AddressBook addressbook = new AddressBook();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Add a contact");
            System.out.println("2. Search and Update contact");
            System.out.println("3. Search and delete a contact");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.print("Enter number of your option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    //Add a contact
                    AddressContact contact = createContact(scanner);
                    addressbook.addContact(contact);
                    break;
                case 2:
                    //Search and update
                    System.out.println("Enter name of contact to update: ");
                    String searchName = scanner.nextLine();
                    AddressContact foundContact = addressbook.findContactByName(searchName);
                    if (foundContact != null) {
                        AddressContact updatedContact = createContact(scanner);
                        addressbook.updateContact(foundContact, updatedContact);
                        System.out.println("Contact updated.");
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 3:
                    //Search and delete
                    System.out.println("Enter the name of the contact to delete: ");
                    String deleteName = scanner.nextLine();
                    AddressContact deleteContact = addressbook.findContactByName(deleteName);
                    if (deleteContact != null) {
                        addressbook.deleteContact(deleteContact);
                        System.out.println("Contact deleted");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    addressbook.displayAddressBook();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Choose again.");
            }

            System.out.println();
        }
    }




        public static AddressContact createContact(Scanner scanner){
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Street: ");
            String street = scanner.nextLine();

            System.out.println("City: ");
            String city = scanner.nextLine();

            System.out.println("State: ");
            String state = scanner.nextLine();

            System.out.println("ZipCode: ");
            String zipCode = scanner.nextLine();

            System.out.println("Phone Number: ");
            String phoneNumber = scanner.nextLine();


            return new AddressContact.Builder()
                    .name(name)
                    .street(street)
                    .city(city)
                    .state(state)
                    .zipCode(zipCode)
                    .phoneNumber(phoneNumber)
                    .build();
        }

/*
        AddressContact contact2 = new AddressContact.Builder()
                .name("Jane Doe")
                .street("11420 Newell")
                .city("Howard County")
                .state("MD")
                .zipCode("21233")
                .phoneNumber("5438503321")
                .build();

        AddressContact newContact1 = new AddressContact.Builder()
                .name("Joe Man")
                .street("11420 Newell")
                .city("Howard County")
                .state("MD")
                .zipCode("21233")
                .phoneNumber("5438503322")
                .build();


        addressBook.addContact(contact2);
        addressBook.displayAddressBook();
        addressBook.updateContact(contact1, newContact1);
        addressBook.displayAddressBook();
        addressBook.deleteContact(contact2);
        addressBook.displayAddressBook();
*/


    }

package org.example;


import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Address Book Application");
        System.out.println("Enter Contact Details");

        boolean addMoreContact = true;
        while (addMoreContact) {

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


            AddressContact contact = new AddressContact.Builder()
                    .name(name)
                    .street(street)
                    .city(city)
                    .state(state)
                    .zipCode(zipCode)
                    .phoneNumber(phoneNumber)
                    .build();

            addressBook.addContact(contact);

            System.out.println("\nAdd another Contact? (Y/N): ");
            String choice = scanner.nextLine();
            addMoreContact = choice.equalsIgnoreCase("Y");
        }

        System.out.println("\nAddress Book Contacts");
        addressBook.displayAddressBook();

        System.out.println("\nEnter name of contact to delete: ");
        String contactName = scanner.nextLine();
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
}
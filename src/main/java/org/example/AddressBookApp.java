package org.example;


public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        AddressContact contact1 = new AddressContact.Builder()
                .name("John Doe")
                .street("11420 Old Frederick")
                .city("Prince Georges")
                .state("MD")
                .zipCode("21103")
                .phoneNumber("4438503321")
                .build();

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

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.displayAddressBook();
        addressBook.updateContact(contact1, newContact1);
        addressBook.displayAddressBook();
        addressBook.deleteContact(contact2);
        addressBook.displayAddressBook();

    }
}
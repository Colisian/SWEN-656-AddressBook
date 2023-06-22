package org.example;


public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        AddressContact contact = new AddressContact.Builder()
                .name("John Doe")
                .street("11420 Old Frederick")
                .city("Prince Georges")
                .state("MD")
                .zipCode("21103")
                .phoneNumber("4438503321")
                .build();
    }
}
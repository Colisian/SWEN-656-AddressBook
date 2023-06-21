package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<AddressContact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }

    public void addContact(AddressContact contact){
        contacts.add(contact);
        System.out.println("Contact added: " + contact);
    }

    public void deleteContact(AddressContact contact){
        contacts.remove(contact);
        System.out.println("Contact deleted: " + contact);
    }
    public void updateContact(AddressContact outdateContact, AddressContact newContact){
        //Uses indexof to find the out of date contact in the contacts list, if it is not found it will return -1
        int index = contacts.indexOf(outdateContact);
        if (index != -1){
            //old contact is found in the address book replace it with the new one.
            contacts.set(index, newContact);
            System.out.println("Contact updated: " + outdateContact + " -> " + newContact);
        } else {
            //if the old contact is not found display message
            System.out.println("Contact not found: " + outdateContact);
        }
    }

}

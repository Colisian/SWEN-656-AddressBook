package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<AddressContacts> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }

    public void addContact(AddressContacts contact){
        contacts.add(contact);
        System.out.println("Contact added: " + contact);
    }

    public void deleteContact(AddressContacts contact){
        contacts.remove(contact);
        System.out.println("Contact deleted: " + contact);
    }
    public void updateContact(AddressContacts outdateContact, AddressContacts newContact){
        int index = contacts.indexOf(outdateContact);
        if (index != -1){
            contacts.set(index, newContact);
            System.out.println("Contact updated: " + outdateContact + " -> " + newContact);
        } else {
            System.out.println("Contact not found: " + outdateContact);
        }
    }

}

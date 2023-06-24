
package org.example;

import javax.management.MBeanFeatureInfo;
import java.io.*;

public aspect AddressBookAspect {
    private String filename = "address_book.txt";

    //specifies that the pointcut will match method calls to 'void AddressBook.updateContact(AddressContact contact, AddressContact, contact)'
    pointcut updateContactPointcut(AddressContact outdateContact, AddressContact newContact):
            call(void AddressBook.updateContact(AddressContact, AddressContact)) && args(outdateContact, newContact);

    pointcut deleteContactPointcut(AddressContact contact):
            call(void AddressBook.deleteContact(AddressContact)) && args(contact);

    //runs before updateContactPointcut is matched. Captures the outdated and new contact objects passed in updateContact
    before(AddressContact outdateContact, AddressContact newContact): updateContactPointcut(outdateContact, newContact){
        writeToFile(outdateContact.toString());
    }

    //
    before(AddressContact contact): deleteContactPointcut(contact){
        writeToFile(contact.toString());
    }

    private void writeToFile(String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file " + e.getMessage());
        }
    }
}

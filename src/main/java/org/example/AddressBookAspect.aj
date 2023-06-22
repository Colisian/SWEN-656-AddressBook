
package org.example;

import javax.management.MBeanFeatureInfo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public aspect AddressBookAspect {

    pointcut updateContactPointcut(AddressContact outdateContact, AddressContact newContact):
            execution(void AddressBook.updateContact(*, *)) ;

    // Pointcut for the deleteContact() method
    pointcut deleteContactPointcut(AddressContact contact):
            execution(void AddressBook.deleteContact(*));



    before(AddressContact outdateContact, AddressContact newContact) : updateContactPointcut(outdateContact, newContact){
        String oldData = outdateContact.toString();
        writeToFile(oldData);
    }

    before(AddressContact contact) : deleteContactPointCut(contact){
        String currentData = contact.toString();
        writeToFile(currentData);

    }
    private void writeToFile(String data){
        try {
            FileWriter fileWriter = new FileWriter("address_book.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

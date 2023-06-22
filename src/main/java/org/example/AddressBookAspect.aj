package org.example;

import javax.management.MBeanFeatureInfo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public aspect AddressBookAspect {

    before(AddressContact contact) : updateContact(contact, *){
        String oldData = contact.toString();
        writeToFile(oldData);
    }

    before(AddressContact contact) : deleteContact(contact, *){
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

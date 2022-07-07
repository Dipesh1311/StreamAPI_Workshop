package com.bridgelabz.AddressBook;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public static void main(String[] args) {

        Contact dipesh = new Contact();
        dipesh.setFirstName("Dipesh");
        dipesh.setCity("Mumbai");
        dipesh.setState("Maharashtra");

        Contact raj = new Contact();
        raj.setFirstName("Raj");
        raj.setCity("Surat");
        raj.setState("Gujrat");

        List<Contact> myContactList = new ArrayList<Contact>();
        myContactList.add(dipesh);
        myContactList.add(raj);
        System.out.println(myContactList);

    }
}

package org.example;

import java.util.HashMap;
public class AddressBook {

    static HashMap<String,String> contacts = new HashMap<>();

    public static void addContact(String name, String phone){
        contacts.put(name,phone);
    }
    public void removeContact(String name){
        contacts.remove(name);
    }

    public String getPhone(String name){
        return contacts.get(name);
    }


}

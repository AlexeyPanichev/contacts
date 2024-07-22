package org.example;

import java.util.*;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
            return contacts.size();
        }
        return contacts.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return contacts.get(name);
    }

    public void printAllNames() {
        List<String> names = new ArrayList<>(contacts.keySet());
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}

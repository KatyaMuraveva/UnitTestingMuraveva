package third_task;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private Map<String, String> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }


    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }


    public String getPhone(String name) {
        return contacts.get(name);
    }


    public void removeContact(String name) {
        contacts.remove(name);
    }
}


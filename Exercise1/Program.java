package Exercise1;

import java.util.*;

public class Program {
    private HashMap<String, List<String>> book;
    public Program() {
        this.book = new HashMap<>();
    }
    
    public void addContact(String name, String phone) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<>());
        }
        book.get(name).add(phone);
    }
    
    public void printContacts() {
        ArrayList<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(book.entrySet());
        sortedList.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : sortedList) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Program myPhonebook = new Program();
        myPhonebook.addContact("Adam", "123456");
        myPhonebook.addContact("Eve", "234567");
        myPhonebook.addContact("Adam", "345678");
        myPhonebook.addContact("John", "456789");
        myPhonebook.printContacts();
    }
}
import java.util.*;

public class AddressBook {

    static class Contact {
        String name, phone, email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public static void main(String[] args) {

        ArrayList<Contact> list = new ArrayList<>();
        HashMap<String, Contact> map = new HashMap<>();
        HashSet<String> phones = new HashSet<>();

        Contact c1 = new Contact("Rahul", "9999", "r@gmail.com");
        Contact c2 = new Contact("Aman", "8888", "a@gmail.com");

        if (phones.add(c1.phone)) {
            list.add(c1);
            map.put(c1.name, c1);
        }

        if (phones.add(c2.phone)) {
            list.add(c2);
            map.put(c2.name, c2);
        }

        System.out.println("Search Rahul:");
        System.out.println(map.get("Rahul").phone);

        map.remove("Aman");
        list.removeIf(c -> c.name.equals("Aman"));

        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nContacts:");
        for (Contact c : list)
            System.out.println(c.name + " " + c.phone + " " + c.email);
    }
}
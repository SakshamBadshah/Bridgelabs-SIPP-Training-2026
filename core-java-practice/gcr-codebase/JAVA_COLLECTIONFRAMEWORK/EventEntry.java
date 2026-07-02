import java.util.*;

public class EventEntry {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("a@gmail.com");

        System.out.println("Registered Participants");

        for (String s : emails)
            System.out.println(s);

        System.out.println("Total = " + emails.size());

    }
}
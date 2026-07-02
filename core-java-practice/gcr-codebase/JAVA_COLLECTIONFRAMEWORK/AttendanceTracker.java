import java.util.*;

public class AttendanceTracker {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        map.put("Java", new ArrayList<>());
        map.put("Python", new ArrayList<>());

        if (!map.get("Java").contains("Rahul"))
            map.get("Java").add("Rahul");

        if (!map.get("Java").contains("Rahul"))
            map.get("Java").add("Rahul");

        map.get("Python").add("Aman");

        for (String subject : map.keySet()) {

            System.out.println(subject + " : " + map.get(subject));

            System.out.println("Total = " + map.get(subject).size());
        }

    }
}
import java.util.*;

public class TrafficMonitoring {

    public static void main(String[] args) {

        HashMap<String, Integer> roads = new HashMap<>();

        roads.put("Road A", 120);
        roads.put("Road C", 250);
        roads.put("Road B", 180);

        TreeMap<String, Integer> sorted = new TreeMap<>(roads);

        System.out.println("Traffic Report");

        for (String road : sorted.keySet())
            System.out.println(road + " : " + sorted.get(road));

        String busy = "";
        int max = 0;

        for (String road : roads.keySet()) {

            if (roads.get(road) > max) {
                max = roads.get(road);
                busy = road;
            }

        }

        System.out.println("\nBusiest Road = " + busy);
        System.out.println("Total Roads = " + roads.size());

    }
}
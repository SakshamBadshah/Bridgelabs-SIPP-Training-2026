import java.util.*;

public class ParkingManager {

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();

        vehicles.add("UP32AB1234");
        vehicles.add("DL10XY5678");
        vehicles.add("MP09AA9999");

        vehicles.remove("DL10XY5678");

        String search = "UP32AB1234";

        if (vehicles.contains(search))
            System.out.println("Vehicle Found");
        else
            System.out.println("Vehicle Not Found");

        System.out.println("\nParked Vehicles");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Total Slots Occupied = " + vehicles.size());

    }
}
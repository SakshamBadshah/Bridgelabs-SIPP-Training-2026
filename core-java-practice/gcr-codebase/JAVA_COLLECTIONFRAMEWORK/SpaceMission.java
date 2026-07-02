import java.util.*;

class Astronaut {

    int id;
    String name, specialization;

    Astronaut(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + specialization;
    }
}

public class SpaceMission {

    public static void main(String[] args) {

        HashMap<String, List<Astronaut>> missions = new HashMap<>();
        HashSet<Integer> ids = new HashSet<>();

        missions.put("Chandrayaan", new ArrayList<>());

        Astronaut a1 = new Astronaut(1, "Rahul", "Pilot");

        if (ids.add(a1.id))
            missions.get("Chandrayaan").add(a1);

        System.out.println(missions);

    }
}
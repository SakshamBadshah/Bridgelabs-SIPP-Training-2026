import java.util.PriorityQueue;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        pq.offer(new Patient(3, "Rahul"));
        pq.offer(new Patient(1, "Aman"));
        pq.offer(new Patient(2, "Priya"));
        pq.offer(new Patient(5, "Neha"));

        while (!pq.isEmpty()) {

            Patient p = pq.poll();

            System.out.println(p.name + " Priority : " + p.priority);
        }
    }
}
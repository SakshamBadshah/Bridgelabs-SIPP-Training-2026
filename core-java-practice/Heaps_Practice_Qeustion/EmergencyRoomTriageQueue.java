import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class EmergencyRoomTriageQueue {

    public static void main(String[] args) {

        PriorityQueue<Patient> triageQueue =
                new PriorityQueue<>((a, b) -> b.severity - a.severity);

        triageQueue.offer(new Patient("Rahul", 5));
        triageQueue.offer(new Patient("Aman", 9));
        triageQueue.offer(new Patient("Priya", 7));
        triageQueue.offer(new Patient("Neha", 10));

        System.out.println("Treatment Order:");

        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
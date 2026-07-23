import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueueDeque {

    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        queue.addLast("Job1");
        queue.addLast("Job2");
        queue.addLast("Job3");

        queue.addFirst("UrgentJob");

        while (!queue.isEmpty()) {

            System.out.println("Printing : " + queue.removeFirst());
        }
    }
}
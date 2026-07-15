import java.util.Scanner;

class Node {
    int taskId;
    Node next;

    Node(int taskId) {
        this.taskId = taskId;
    }
}

public class TaskQueueDeletion {

    static Node removeTask(Node head, int taskId) {

        if (head == null)
            return null;

        if (head.taskId == taskId)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }

    static void display(Node head) {

        while (head != null) {
            System.out.print(head.taskId + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            
            display(head);
            
            System.out.print("Enter Task ID to delete: ");
            int id = sc.nextInt();
            
            head = removeTask(head, id);
            
            System.out.println("Updated Queue:");
            display(head);
        }
    }
}
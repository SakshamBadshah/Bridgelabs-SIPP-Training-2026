import java.util.Scanner;

class Node {
    int trackId;
    Node next;

    Node(int trackId) {
        this.trackId = trackId;
        this.next = null;
    }
}

public class PlaylistInsertion {

    static Node insertAfter(Node current, int trackId) {
        if (current == null)
            return null;

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;

        return newNode;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.trackId + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Node head = new Node(101);
            head.next = new Node(102);
            head.next.next = new Node(103);
            
            System.out.println("Original Playlist:");
            display(head);
            
            System.out.print("Enter new Track ID: ");
            int id = sc.nextInt();
            
            insertAfter(head, id);
            
            System.out.println("Updated Playlist:");
            display(head);
        }
    }
}
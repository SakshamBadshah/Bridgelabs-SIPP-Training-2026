class Node {

    int serverId;
    Node next;

    Node(int serverId) {
        this.serverId = serverId;
    }
}

public class MiddleServer {

    static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);
        head.next.next.next.next = new Node(105);

        Node middle = findMiddle(head);

        System.out.println("Middle Server = " + middle.serverId);
    }
}
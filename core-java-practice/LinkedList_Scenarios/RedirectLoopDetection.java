class Node {

    @SuppressWarnings("unused")
    String url;
    Node next;

    Node(String url) {
        this.url = url;
    }
}

public class RedirectLoopDetection {

    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");

        a.next = b;
        b.next = c;
        c.next = d;

        // Create Loop
        d.next = b;

        if (hasCycle(a))
            System.out.println("Redirect Loop Detected");
        else
            System.out.println("No Loop");
    }
}
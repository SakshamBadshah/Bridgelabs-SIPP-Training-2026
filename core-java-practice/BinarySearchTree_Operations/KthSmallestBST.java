import java.util.Stack;

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class KthSmallestBST {

    static int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();

        Node current = root;

        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {

                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            count++;

            if (count == k)
                return current.data;

            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("3rd Smallest = " + kthSmallest(root, 3));
    }
}
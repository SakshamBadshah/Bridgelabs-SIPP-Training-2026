class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PostorderDeleteTree {

    static void deleteTree(Node root) {

        if (root == null)
            return;

        deleteTree(root.left);

        deleteTree(root.right);

        System.out.println("Deleting Node : " + root.data);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        deleteTree(root);
    }
}
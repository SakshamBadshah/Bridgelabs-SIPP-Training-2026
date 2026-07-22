class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTDelete {

    static Node insert(Node root, int value) {

        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    static Node delete(Node root, int value) {

        if (root == null)
            return null;

        if (value < root.data)
            root.left = delete(root.left, value);

        else if (value > root.data)
            root.right = delete(root.right, value);

        else {

            if (root.left == null && root.right == null)
                return null;

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node successor = root.right;

            while (successor.left != null)
                successor = successor.left;

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Before Delete");
        inorder(root);

        root = delete(root, 50);

        System.out.println("\nAfter Delete");
        inorder(root);
    }
}
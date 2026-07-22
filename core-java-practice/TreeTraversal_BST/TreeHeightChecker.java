class Node {

    @SuppressWarnings("unused")
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class TreeHeightChecker {

    static int height(Node root) {

        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static boolean isTooDeep(Node root, int threshold) {

        return height(root) > threshold;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        int h = height(root);

        System.out.println("Tree Height = " + h);

        int threshold = 2;

        if (isTooDeep(root, threshold))
            System.out.println("Tree exceeds threshold.");
        else
            System.out.println("Tree is within threshold.");
    }
}
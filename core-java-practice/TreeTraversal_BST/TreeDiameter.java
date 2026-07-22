class Node {

    @SuppressWarnings("unused")
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class TreeDiameter {

    static int diameter = 0;

    static int height(Node root) {

        if (root == null)
            return -1;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);

        height(root);

        System.out.println("Tree Diameter = " + diameter);
    }
}
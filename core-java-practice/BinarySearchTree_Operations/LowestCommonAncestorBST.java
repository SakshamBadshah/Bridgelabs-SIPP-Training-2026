class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class LowestCommonAncestorBST {

    static Node lca(Node root, int p, int q) {

        while (root != null) {

            if (p < root.data && q < root.data)
                root = root.left;

            else if (p > root.data && q > root.data)
                root = root.right;

            else
                return root;
        }

        return null;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Node ans = lca(root, 20, 40);

        System.out.println("Lowest Common Ancestor = " + ans.data);
    }
}
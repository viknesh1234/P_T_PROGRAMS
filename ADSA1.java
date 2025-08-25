public class ADSA1 {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {   // Constructor
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    Node root;  // Class level root

    // Method to create a binary tree
    void createBN() {
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);

        // Connect Nodes
        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        // Assign root
        root = firstNode;
    }

    // ✅ Inorder traversal method (OUTSIDE createBN)
    void order(Node node) {
        if (node == null) {
            return;
        }
        order(node.left);
        System.out.print(node.data + " ");
        order(node.right);
    }

    public static void main(String[] args) {
        ADSA1 bn = new ADSA1();   // Create object
        bn.createBN();            // Build tree
        System.out.print("Inorder Traversal: ");
        bn.order(bn.root);
    }
}

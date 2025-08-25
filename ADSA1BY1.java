public class ADSA1BY1 {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {   // Constructor
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    //function to check if the tree is a static binary tree
    boolean isStaticBinaryTree(Node node) {

        //in case is empty it is static binary tree
        if (node == null) {
            return true; // An empty tree is a static binary tree
        }

        //in case is leaf node and has no childern it is static binary tree
        if( node.left == null && node.right == null) {
            return true; // A leaf node is a static binary tree
        }

        //if it has both left and right children it is not a static binary tree
        if (node.left != null && node.right != null) {
            return isStaticBinaryTree(node.left) && isStaticBinaryTree(node.right);
        }
            return false; // A static binary tree cannot have both left and right children
        }

        //function to print whether the tree is a static binary tree or not
        void printStaticBinaryTreeStatus(Node node) {
            if (isStaticBinaryTree(node)) {
                System.out.println("The tree is a static binary tree.");
            } else {
                System.out.println("The tree is not a static binary tree.");
            }
        }
    public static void main(String[] args) {
        ADSA1BY1 tree = new ADSA1BY1(); // Create object
        tree.root = new Node(1); // Create root node
        tree.root.left = new Node(2); // Create left child
        tree.root.right = new Node(3); // Create right child
        tree.root.left.left = new Node(4); // Create left child's left child
        tree.root.left.right = new Node(5); // Create left child's right child
        tree.root.right.left = new Node(6); // Create right child's left child
        tree.root.right.right = new Node(7); // Create right child's right child
        tree.root.left.left.left = new Node(8); // Create left child's left child's left child
        tree.root.left.left.right = new Node(9); // Create left child's left child's right child
    
        // print result for tree 4
        tree.printResult(tree.root);
        //construct the binary tree for tree B
        ADSA1BY1 treeAdsa1by1 = new ADSA1BY1();
        treeAdsa1by1.root = new Node(1);
        treeAdsa1by1.root.left = new Node(2);
        treeAdsa1by1.root.right = new Node(3);
        treeAdsa1by1.root.left = new Node(4);
        treeAdsa1by1.root.right = new Node(5);
        treeAdsa1by1.root.right = new Node(6);
    }
}

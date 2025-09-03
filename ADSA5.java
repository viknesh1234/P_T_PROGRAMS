public class ADSA5 {

    
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

 
    static class BinaryTree {
        Node root;

      
        int countNodes(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }

   
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int totalNodes = tree.countNodes(tree.root);
        System.out.println("Total number of nodes: " + totalNodes);
    }
}

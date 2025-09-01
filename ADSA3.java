import java.util.*;
import java.io.*;
import java.util.Stack.*;
public class ADSA3 {

    static class Node {
        int data;
        Node left, right;
        Node(int x) {
            data = x;
            left = right = null;
        }
    }

    // Iterative Inorder Traversal
    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();   
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.data);
            curr = curr.right;
        }
        return res;
    }

    // Iterative Preorder Traversal
    public static void iterativePreOrder(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();   
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");

            if (curr.right != null)
             stack.push(curr.right);
            if (curr.left != null) 
            stack.push(curr.left);
        }
        System.out.println();
    }

    // Iterative Postorder Traversal
    public static void iterativePostorderTraversal(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>();   
        Stack<Node> s2 = new Stack<>();  
        s1.push(root);

        while (!s1.isEmpty()) {
            Node curr = s1.pop();
            s2.push(curr);

            if (curr.left != null) s1.push(curr.left);
            if (curr.right != null) s1.push(curr.right);
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop().data + " ");
        }
        System.out.println();
    }

    // Utility: print list
    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Build a sample tree for testing
    public static Node buildTreeFromInput() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    public static void main(String[] args) {
        Node root = buildTreeFromInput();

        System.out.println("Inorder Traversal (Iterative): ");
        ArrayList<Integer> inOrderList = inOrder(root);
        printList(inOrderList);

        System.out.println("Preorder Traversal (Iterative): ");
        iterativePreOrder(root);

        System.out.println("Postorder Traversal (Iterative): ");
        iterativePostorderTraversal(root);
    }
}

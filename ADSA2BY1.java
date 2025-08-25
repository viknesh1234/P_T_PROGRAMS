import java.util.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ADSA2BY1 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) {
            val = v;
            left = right = null;
        }
    }

    public static TreeNode buildTreeFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value (or -1/null to stop):");
        String rootVal = sc.next();

        if(rootVal.equals("null") || rootVal.equalsIgnoreCase("stop")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(rootVal));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean stopflag = false;

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Left child
            System.out.println("Enter left child of " + current.val + " (or -1/null):");
            String leftVal = sc.next();
            if(!(leftVal.equalsIgnoreCase("stop") )) {
                current.left = new TreeNode(Integer.parseInt(leftVal));
                stopflag = false;
                 break;
              
            }
            if(!( leftVal.equalsIgnoreCase("null"))) {
                current.left = new TreeNode(Integer.parseInt(leftVal));
                queue.add(current.left);
            }

            // Right child
            System.out.println("Enter right child of " + current.val + " (or -1/null):");
            String rightVal = sc.next();
            if(!(rightVal.equals("-1") )) {
                current.right = new TreeNode(Integer.parseInt(rightVal));
                queue.add(current.right);
            }
        }
        return root;
    }// Inorder traversal
public static void inorderTraversal(TreeNode root) {
    if(root == null) return;
    inorderTraversal(root.left);
    System.out.print(root.val + " ");
    inorderTraversal(root.right);
}

// Preorder traversal
public static void preorderTraversal(TreeNode root) {
    if(root == null) return;
    System.out.print(root.val + " ");   // Print first
    preorderTraversal(root.left);       // Then left
    preorderTraversal(root.right);      // Then right
}

// Postorder traversal
public static void postorderTraversal(TreeNode root) {
    if(root == null) return;
    postorderTraversal(root.left);      // Left first
    postorderTraversal(root.right);     // Then right
    System.out.print(root.val + " ");   // Print last
}

    
    
    public static void main(String[] args) {
        TreeNode root = buildTreeFromInput();
        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
        System.out.println();
        System.out.println("Preorder Traversal:");
        preorderTraversal(root);
        System.out.println();
        System.out.println("postorder Traversal : ");
        postorderTraversal(root);
        System.out.println();
    }
}

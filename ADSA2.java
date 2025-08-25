import java.util.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ADSA2 {
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
    }

    public static boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean end = false;

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if(current == null) {
                end = true;
            } else {
                if(end) return false; // found a non-null after null -> not complete
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        TreeNode root = buildTreeFromInput();

        if(isCompleteTree(root)) {
            System.out.println("The tree is a complete binary tree.");
        } else {
            System.out.println("The tree is not a complete binary tree.");
        }
    }
}

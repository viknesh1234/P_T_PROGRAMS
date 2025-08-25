import java.util.*;

import javax.swing.tree.TreeNode;
public class ADSA1BY2 {
    static class Node{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    //method to build tree form input level order
    public static TreeNode buildTreeForminput{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the level order input of tree (use -1 for null):");
        String rootVal = sc.next();
        if (rootVal.equalsIgnoreCase("null")) {
            return null;
            TreeNode root = new TreeNode(Integer.parseInt(rootVal));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode current = queue.poll();
                System.out.println("Enter left child of " + current.val + "(or null)");
            }
        }
    }
}

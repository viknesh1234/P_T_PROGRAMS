import java.util.*;
public class ADSA2BY2 {
    static class Node{
        int data;
        Node left, right;
        Node(int x){
            data = x;
            left = right = null;
        }
    }
    public static levelOrder(Node root){
        if(root == null) 
        return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.print("Level Order Traversal: ");
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null) 
            q.add(curr.left);
            if(curr.right != null) 
            q.add(curr.right);
        }
        System.out.println();
    }
    static int search(int[] in, int strt, int end, int value){
        for(int i = strt; i <= end; i++){
            if(in[i] == value)
            return i;
        }
        return -1;
    }

    static Node buildTree(int[] in, int[] pre, int inStrt, int inEnd){
        if(inStrt > inEnd)
        return null;
        int rootVal = pre[preIndex[0]];
        preIndex[0]++;
        Node tNode = new Node(rootVal);
        if(inStrt == inEnd)
        return tNode;
        int inIndex = search(in, inStrt, inEnd, tNode.data);
        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
        return tNode;
    }
    static Node buildTree(int in[], int pre[]){
        preIndex[0] = 0;
        return buildTree(in, pre, 0, in.length - 1);
    }
    public static void main(String[] args) {
        int in[] = {4, 2, 5, 1, 6, 3, 7};
        int pre[] = {1, 2, 4, 5, 3, 6, 7};
        Node root = buildTree(in, pre);
        System.out.println("Tree constructed from Inorder and Preorder:");
        levelOrder(root);
    }
}

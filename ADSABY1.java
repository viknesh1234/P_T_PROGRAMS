import java.util.*;
import java.io.*;
import java.util.Stack.*;
public class ADSABY1 {
    static class Node{
        int data;
        Node left, right;
        Node(int value){
        this.data = value;
        this.left = null;
        this.right = null;
        }
    }
    Node root;
    public ADSABY1(){
        root = null;
    }
    // bst insertion
    public void insert(int value){
        root = insertRec(root, value);
    }
    private Node insertRec(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.data){
            root.left = insertRec(root.left, value);
        }else if(value > root.data){
            root.right = insertRec(root.right, value);
        }
        return root; // dup
    }   
    public void inorderTraversal(){
        if( node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    } 
    public int calculateHeight(Node node){
        if(node == null) 
        return -1;
    
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public int countNodes(Node node){
        if(node == null) 
        return 0;
    
        return 1 + countNodes(node.left) + countNodes(node.right);
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ADSABY1 bst = new ADSABY1();
    System.out.println("Enter number of nodes to insert:");
    while(true){
        String root = sc.nextLine();
        if(root.equalsIgnoreCase("stop")){
            break;
        } else if(root.equalsIgnoreCase(bst)) {
            continue;
        }
        else {
            try{
                int value = Integer.parseInt(root);
                bst.insert(value);
                System.out.println("Inserted: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'stop' to finish.");
            }
        }

    }
    System.out.println("Inorder Traversal:");
    bst.inorderTraversal(bst.root);
    System.out.println();
    System.out.println("Height of tree: " + bst.calculateHeight(bst.root));
    System.out.println("Total nodes in tree: " + bst.countNodes(bst.root));
}
}

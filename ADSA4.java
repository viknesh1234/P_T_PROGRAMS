import java.util.*;
import java.util.Stack; 

public class ADSA4 {

    // Make Node static so it can be used in static methods
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node sortLinkedList(Node head) {
        if (head == null) return null;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        // Push linked list values into stack
        Node curr = head;
        while (curr != null) {
            stack.push(curr.data);
            curr = curr.next;
        }

        // Sort using tempStack
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        // Rebuild linked list in sorted order
        Node newHead = new Node(tempStack.pop());
        Node newCurr = newHead;
        while (!tempStack.isEmpty()) {
            newCurr.next = new Node(tempStack.pop());
            newCurr = newCurr.next;
        }
        return newHead;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);

        System.out.println("Original Linked List:");
        printList(head);

        head = sortLinkedList(head);

        System.out.println("Sorted Linked List:");
        printList(head);
    }
}

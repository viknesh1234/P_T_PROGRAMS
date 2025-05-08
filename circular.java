import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class circular {
    Node head;

   
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

   
    public void makeCircular() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head; 
    }

    
    public boolean isCircular() {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; 
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        circular list = new circular();

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.append(value);
        }

        System.out.print("Do you want to make the list circular? (yes/no): ");
        String makeCircular = scanner.next();

        if (makeCircular.equalsIgnoreCase("yes")) {
            list.makeCircular();
        }

        boolean result = list.isCircular();
        System.out.println("Is the linked list circular? " + result);

        scanner.close();
    }
}

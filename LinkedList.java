class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
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

    
    public int findLengthUsingTwoPointers() {
        if (head == null) return 0;

        Node slow = head;
        Node fast = head;
        int count = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            count += 2;
        }
 
        
        if (fast != null && fast.next == null) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        int length = list.findLengthUsingTwoPointers();
        System.out.println("Length of the list: " + length);
    }
}

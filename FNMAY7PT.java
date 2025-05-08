import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class SingleLinkedList {
    Node head;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Print the list
    public void printSLL() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    // Merge two lists
    public void mergeLinkedList(SingleLinkedList otherList) {
        if (head == null) {
            head = otherList.head;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = otherList.head;
    }

    // Remove all duplicates (even non-adjacent)
    public void removeDuplicates() {
        Node curr = head;
        while (curr != null) {
            Node runner = curr;
            while (runner.next != null) {
                if (runner.next.data == curr.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
    }
}

public class FNMAY7PT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList sll1 = new SingleLinkedList();
        SingleLinkedList sll2 = new SingleLinkedList();

        System.out.println("Enter elements for List 1 (-1 to end):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            sll1.insertAtEnd(n);
        }

        System.out.println("Enter elements for List 2 (-1 to end):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            sll2.insertAtEnd(n);
        }

        // Merge and remove duplicates
        sll1.mergeLinkedList(sll2);
        sll1.removeDuplicates();

        // Print the final result
        System.out.println("Merged list without duplicates:");
        sll1.printSLL();

        sc.close();
    }
}


// import java.util.*;
// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//     }
// }
// class SingleLinkedList {
//     Node head;

//     public void insertAtBegin(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node curr = head;
//         while (curr.next != null) {
//             curr = curr.next;
//         }
//         curr.next = newNode;
//     }

//     public void display() {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + "->");
//             curr = curr.next;
//         }
//     }
// }// Compare this snippet from FNMAY7PT.java:
// // import java.util.Scanner;
// public class FNMAY7PT {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         SingleLinkedList sll = new SingleLinkedList();
//         for(int i = 1; i <  ; i++) {
//             sll.insertAtEnd(sc.nextInt());
//         }
//         //sll.insertAtEnd(sc.nextInt());
//         // sll.insertAtEnd(20);
//         // sll.insertAtEnd(30);
//         // sll.insertAtEnd(40);
//         // //sll.display();

//         // sll.insertAtEnd(50);
//         // sll.insertAtEnd(60);
//         // //sll.display();
//         // sll.insertAtEnd(70);
//         // sll.insertAtEnd(80);
//         // //sll.display();
//         // sll.insertAtEnd(90);
//         // //sll.display();
//         // sll.insertAtEnd(100);
//         sll.display();          
//         sc.close();
//     }
// }

// import java.util.*;
// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//     }
// }
// class Link{
//     Node head;
//     void insert(int data){
//         Node newn=new Node(data);
//         if(head==null){
//             head=newn;
//             return;
//         }
//         Node c=head;
//         while(c.next!=null){
//             c=c.next;
//         }
//         c.next=newn;
//     }
//     void display(){
//         Node c=head;
//         while(c!=null){
//             System.out.print(c.data+" ");
//             c=c.next;
//         }
//     }

//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         Link list=new Link();
//         while(true){
//             int n=s.nextInt();
//             if(n==-1){
//                 break;
//             }
//             list.insert(n);
//         }
//         list.display();
//     }
// }
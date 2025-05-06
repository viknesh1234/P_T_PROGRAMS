import java.util.Scanner;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
class SingleLinkedList{
	Node head;
	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public void deleteAtBegin() {
		if(head == null) {
			System.out.println("Single Linked List is Empty");
			return;
		}
		head = head.next;
	}
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data +" -> ");
			curr = curr.next;
		}
	}
	public void countNode() {
		int count = 0;
		Node curr = head;
		while(curr != null) {
			curr = curr.next;
			count++;
		}
		System.out.println("Total Nodes : "+count);
	}
	
	public void deleteAtEnd() {	
		Node curr = head;
		if(head == null) {
			System.out.println("Linked List is Empty ");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	
	public void insertAtPosition(int pos, int data) {
		if(head==null) {
			System.out.println("Linked List is Empty ");
			return;
		}
		if(pos<=0) {
			System.out.println("Invalid position");
			return;
		}
		if(pos == 1) {
			insertAtBegin(data);
			return;
		}
		Node curr = head;
		Node newNode = new Node(data);
		for(int i=1; i<pos-1 && curr != null; i++ ) {
			curr = curr.next;
			if(curr.next == null) {
				System.out.println("Invalid Position");
				return;
			}
		}
		newNode.next = curr.next;
		curr.next = newNode;
	}
	
	public void deleteAtPosition(int pos) {
		if(head == null) {
			System.out.println("Linked List is Empty");
            return;
		}
		if(pos<=0) {
			System.out.println("Invalid Position");
			return;
		}
		if(pos==1) {
			deleteAtBegin();
			return;
		}
		Node curr = head;
		for(int i=1; i<pos-1 && curr != null; i++ ) {
			curr = curr.next;
			if(curr.next == null) {
				System.out.println("Invalid Position");
				return;
			}
		}
		curr.next = curr.next.next;
	}
}



class ANMAY6PT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SingleLinkedList sll = new SingleLinkedList();
		
		
		sll.insertAtEnd(10);
		sll.insertAtEnd(20);
		sll.insertAtEnd(30);
		sll.insertAtEnd(40);
		sll.insertAtEnd(50);
		sll.deleteAtPosition(3);
		sll.display();
		
	
	}
}


// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {
//     Node head;

//     // Insert at end
//     void insert(int data) {
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

//     // Display list
//     void display() {
//         Node curr = head;
//         if (curr == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         while (curr != null) {
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("null");
//     }
// }

// public class ANMAY6PT {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList list = new LinkedList();

//         System.out.print("Enter number of elements to insert: ");
//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter value " + (i + 1) + ": ");
//             int val = sc.nextInt();
//             list.insert(val);
//         }

//         System.out.println("Linked List:");
//         list.display();

//         sc.close();
//     }
// }
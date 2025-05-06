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
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+ "->");
			curr = curr.next;
		}
	}
}
class ANMAY5PT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SingleLinkedList sll = new SingleLinkedList();
		
		sll.insertAtEnd(10);
		sll.insertAtEnd(20);
		sll.insertAtEnd(30);
		sll.insertAtBegin(5);
		sll.insertAtBegin(4);
		
		sll.insertAtBegin(3);
	
	}
}
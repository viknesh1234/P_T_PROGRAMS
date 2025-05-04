import java.util.Scanner;

// public class FNMAY3PT {
//     int id;
//     String name;

//     public FNMAY3PT(int id , String name){
//         this.id = id;
//         this.name = name;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         FNMAY3PT[] studentObjects = new FNMAY3PT[3];

//         FNMAY3PT obj = new FNMAY3PT(1, "Amit");
//         FNMAY3PT obj1 = new FNMAY3PT(2, "Ravi");
//         FNMAY3PT obj2 = new FNMAY3PT(3, "Rahul");

//         studentObjects[0] = obj;
//         studentObjects[1] = obj1;
//         studentObjects[2] = obj2;

//         for(int i = 0; i < studentObjects.length; i++){
//             System.out.println("ID: " + studentObjects[i].id);
//             System.out.println("Name: " + studentObjects[i].name);
//             System.out.println("-----------------");
//         }

//         sc.close(); // Good practice to close the scanner
//     }
// }



class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}	
}
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = new Node(10);
		Node node1 = new Node(20);
		head.next = node1;
		Node node2 = new Node(30);
		node1.next = node2;
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);	
	}
}

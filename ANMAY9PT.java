// class UnderFlowException extends Exception {
//     public UnderFlowException(String msg) {
//         super(msg);
//     }
// }

// class Node {
//     int data;
//     Node next;
//     public Node(int data) {
//         this.data = data;
//     }
// }

// class Stack {
//     Node top;
    
//     public boolean isEmpty() {
//         return top == null;
//     }
    
//     public boolean push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//         return true;
//     }
    
//     public int pop() throws UnderFlowException {
//         if (isEmpty()) {
//             throw new UnderFlowException("Nodes Not Available");
//         }
//         int value = top.data;
//         top = top.next;
//         return value;
//     }
    
//     public int peek() throws UnderFlowException {
//         if (isEmpty()) {
//             throw new UnderFlowException("Nodes Not Available");
//         }
//         return top.data;
//     }
    
//     public void display() {
//         if (top == null) {
//             System.out.println("Nodes are Not Available");
//             return;
//         }
//         Node curr = top;
//         System.out.print("Top -->");
//         while (curr != null) {
//             if (curr == top) {
//                 System.out.println("|  " + curr.data + "  |");
//                 System.out.println("       --------");
//             } else {
//                 System.out.println("       |  " + curr.data + "  |");
//                 System.out.println("       --------");
//             }
//             curr = curr.next;
//         }
//     }
// }

// public class ANMAY9PT {
//     public static void main(String[] args) throws UnderFlowException {
//         Stack myStack = new Stack();
//         myStack.push(10);
//         myStack.push(20);
//         myStack.push(30);
//         myStack.push(40);
//         myStack.push(50);
//         myStack.display();
        
//         System.out.println("Peek: " + myStack.peek());
//         System.out.println("Pop: " + myStack.pop());
//         myStack.display();
//     }
// }


import java.util.ArrayList;
import java.util.Scanner;
class UnderFlowException extends Exception{
	public UnderFlowException(String msg) {
		super(msg);
	}
}
class Stack{
	//Last In First Out
	ArrayList<Character> stack = new ArrayList<Character>();
	public boolean push(char data) {
		return stack.add(data);
	}
	public char pop() throws Exception{
		if(isEmpty()) {
			throw new UnderFlowException("Stack is Empty");
		}
		return stack.remove(stack.size()-1);
	}
	public boolean isEmpty() {
		return stack.size()==0;
	}
	public char peak() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}
		return stack.get(stack.size()-1);
	}
	
	public String reverse() throws Exception {
		String rev = "";
		int len = stack.size();
		for(int i=0; i<len; i++) {
			rev = rev + pop();
		}
		return rev;
	}
}
public class ANMAY9PT {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Stack myStack = new Stack();
//		System.out.print("Enter the String : ");
		String s = "Hello";   
		
		for(int i=0; i<s.length(); i++) {
			myStack.push(s.charAt(i));
		}
		System.out.println(myStack.reverse());
	}
}
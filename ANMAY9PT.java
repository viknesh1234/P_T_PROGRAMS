class UnderFlowException extends Exception {
    public UnderFlowException(String msg) {
        super(msg);
    }
}

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node top;
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public boolean push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        return true;
    }
    
    public int pop() throws UnderFlowException {
        if (isEmpty()) {
            throw new UnderFlowException("Nodes Not Available");
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    
    public int peek() throws UnderFlowException {
        if (isEmpty()) {
            throw new UnderFlowException("Nodes Not Available");
        }
        return top.data;
    }
    
    public void display() {
        if (top == null) {
            System.out.println("Nodes are Not Available");
            return;
        }
        Node curr = top;
        System.out.print("Top -->");
        while (curr != null) {
            if (curr == top) {
                System.out.println("|  " + curr.data + "  |");
                System.out.println("       --------");
            } else {
                System.out.println("       |  " + curr.data + "  |");
                System.out.println("       --------");
            }
            curr = curr.next;
        }
    }
}

public class ANMAY9PT {
    public static void main(String[] args) throws UnderFlowException {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.display();
        
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        myStack.display();
    }
}

import java.util.*;
import java.util.ArrayList;

class UnderFlowException extends Exception{
	public UnderFlowException(String msg) {
		super(msg);
	}
}
class Stack{
	//Last In First Out
	ArrayList<Integer> stack = new ArrayList<Integer>();
	public boolean push(int data) {
		return stack.add(data);
	}
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new UnderFlowException("Stack is Empty");
		}
		return stack.remove(stack.size()-1);
	}
	public boolean isEmpty() {
		return stack.size()==0;
	}
	public int peak() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}
		return stack.get(stack.size()-1);
	}
}
public class FNMAY9PT {
	public static void main(String[] args) throws Exception{
			Stack myStack = new Stack();
			myStack.push(10);
			myStack.push(20);
			myStack.pop();
			System.out.print("Top -->");
			for(int i=myStack.stack.size()-1; i>=0; i--) {
				if(i==myStack.stack.size()-1) {
					System.out.println("|  "+myStack.stack.get(i)+ "  |");
					System.out.println("       --------");
					continue;
				}
				System.out.println("       |  "+myStack.stack.get(i)+ "  |");
				System.out.println("       --------");
			}
			System.out.println("Peak Element : "+myStack.peak());
	}
}
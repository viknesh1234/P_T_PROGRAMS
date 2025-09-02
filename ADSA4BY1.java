import java.util.Scanner;

public class ADSA4BY1 {

    static class Stack {
        private int arr[];
        private int top;
        private int capacity;

        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow!");
                return;
            }
            arr[++top] = x;
            System.out.println("Inserted: " + x);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (!isEmpty())
                return arr[top];
            else {
                System.out.println("Stack is Empty!");
                return -1;
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Removed element: " + stack.pop());
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop();
    }
}

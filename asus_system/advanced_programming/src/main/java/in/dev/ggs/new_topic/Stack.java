package in.dev.ggs.new_topic;

public class Stack {

    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.capacity = size;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow Error.");
            return;
        }
        stack[++top] = x;
    }

    // Removes the object at the top of this stack and returns that object as the value of this function.
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Looks at the object at the top of this stack without removing it from the stack.
    public int peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.capacity -1;
    }

    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(24);
        stack.push(27);
        stack.push(44);
        stack.push(77);
        stack.push(777);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack full: " + stack.isFull());

        System.out.println(stack.pop());
        stack.pop();

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack empty: " + stack.isEmpty());
    }
}

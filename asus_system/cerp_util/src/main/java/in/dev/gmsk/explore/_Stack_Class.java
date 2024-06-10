package in.dev.gmsk.explore;

import java.util.Stack;

public class _Stack_Class {

    public static void main(String[] args) {
        example_1();
    }

    /**
     * Handle the empty stack exception.
     */
    public static void example_1() {

        Stack<String> stack = new Stack<>();
        stack.push("AOC");
        stack.push("HP");
        stack.push("DELL");
        stack.push("ASUS");
        System.out.printf("stack = %s%n", stack);

        // to top an element from the stack, use the pop() method
        String popElement = stack.pop();
        System.out.printf("popElement = %s%n", popElement);
        System.out.printf("stack after pop = %s%n", stack);

        // to check if an element is in the stack, use the search() method
        String elementToSearch = "ASUS";
        int position = stack.search(elementToSearch);

        if (position != -1) {
            System.out.printf("Element found at position = %s%n", position);
        } else {
            System.out.println("Element not found.");
        }

        // peek() method to get element of the stack without removing it.
        String topElement = stack.peek();
        System.out.printf("topElement = %s%n", topElement);

        int size = stack.size();
        System.out.println("size = " + size);
    }
}

package assignment;

import java.util.Stack;

public class Q37 {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display stack
        System.out.println("Stack elements: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Display stack after popping
        System.out.println("Stack after popping: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

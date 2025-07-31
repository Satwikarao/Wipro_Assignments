package assignment;

import java.util.LinkedList;
import java.util.Queue;

public class Q36 {
    public static void main(String[] args) {
        // Create a Queue of Strings
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add) elements
        queue.add("Aarav");
        queue.add("Bhavana");
        queue.add("Chirag");

        // Display the queue
        System.out.println("Queue elements: " + queue);

        // Peek at front element
        System.out.println("Front element (peek): " + queue.peek());

        // Dequeue elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        // Display queue after removal
        System.out.println("Queue after polling: " + queue);
    }
}

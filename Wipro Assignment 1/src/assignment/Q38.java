package assignment;

import java.util.PriorityQueue;

public class Q38 {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(50);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(30);

        // Display elements (in ascending order)
        System.out.println("PriorityQueue elements (ascending order):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

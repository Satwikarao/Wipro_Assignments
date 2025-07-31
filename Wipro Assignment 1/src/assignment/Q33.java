package assignment;

import java.util.TreeSet;

public class Q33 {
    public static void main(String[] args) {
        // Create TreeSet of Integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements (unsorted)
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(5);
        numbers.add(70);
        numbers.add(20);

        // Display elements (will be sorted)
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

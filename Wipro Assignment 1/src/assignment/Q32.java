package assignment;

import java.util.HashSet;

public class Q32 {
    public static void main(String[] args) {
        // Create HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Iterate and print
        System.out.println("Fruits in the HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

package assignment;

import java.util.ArrayList;

public class Q22 {
    public static void main(String[] args) {
        // Create an ArrayList of student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Add 5 student names
        studentNames.add("Aarav");
        studentNames.add("Bhavana");
        studentNames.add("Chirag");
        studentNames.add("Diya");
        studentNames.add("Eshan");

        // Display the names using a for-each loop
        System.out.println("List of Students:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}


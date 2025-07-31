package assignment;

import java.util.LinkedList;

public class Q34 {
    public static void main(String[] args) {
        // Create LinkedList of student names
        LinkedList<String> students = new LinkedList<>();

        // Add student names
        students.add("Aarav");
        students.add("Bhavana");
        students.add("Chirag");
        students.add("Diya");
        students.add("Eshan");

        // Display names
        System.out.println("Student Names in LinkedList:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}

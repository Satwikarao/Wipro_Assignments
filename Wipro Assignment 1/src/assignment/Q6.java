package assignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take marks input
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Determine grade
        char grade;
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter between 0 and 100.");
        } else if (marks < 25) {
            grade = 'F';
            System.out.println("Your grade is: " + grade);
        } else if (marks <= 45) {
            grade = 'E';
            System.out.println("Your grade is: " + grade);
        } else if (marks <= 50) {
            grade = 'D';
            System.out.println("Your grade is: " + grade);
        } else if (marks <= 60) {
            grade = 'C';
            System.out.println("Your grade is: " + grade);
        } else if (marks <= 80) {
            grade = 'B';
            System.out.println("Your grade is: " + grade);
        } else {
            grade = 'A';
            System.out.println("Your grade is: " + grade);
        }

        scanner.close();
    }
}


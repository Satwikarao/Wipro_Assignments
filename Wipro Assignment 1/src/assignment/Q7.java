package assignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter number of classes held: ");
        int classesHeld = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int classesAttended = scanner.nextInt();

        // Calculate attendance %
        double attendance = ((double) classesAttended / classesHeld) * 100;

        // Display percentage
        System.out.printf("Attendance percentage: %.2f%%\n", attendance);

        // Check eligibility
        if (attendance >= 70) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }

        scanner.close();
    }
}


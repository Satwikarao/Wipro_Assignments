package assignment;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input classes
        System.out.print("Enter number of classes held: ");
        int classesHeld = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int classesAttended = scanner.nextInt();

        scanner.nextLine(); // clear newline
        System.out.print("Do you have a medical cause? (Y/N): ");
        String medical = scanner.nextLine();

        // Calculate attendance
        double attendance = ((double) classesAttended / classesHeld) * 100;
        System.out.printf("Attendance percentage: %.2f%%\n", attendance);

        // Decision
        if (attendance >= 70 || medical.equalsIgnoreCase("Y")) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }

        scanner.close();
    }
}


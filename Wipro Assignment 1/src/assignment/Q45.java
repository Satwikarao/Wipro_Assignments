package assignment;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Read string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display input
        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);

        scanner.close();
    }
}

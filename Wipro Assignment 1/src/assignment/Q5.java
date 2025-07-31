package assignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        // Calculate and display bonus
        if (years > 6) {
            double bonus = salary * 0.10;
            System.out.println("You are eligible for a bonus of: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        scanner.close();
    }
}


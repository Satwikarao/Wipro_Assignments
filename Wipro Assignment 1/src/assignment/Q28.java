package assignment;

import java.util.Scanner;

public class Q28 {

    // Enum for Days
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (e.g., MONDAY): ");
        String input = scanner.next().toUpperCase();

        try {
            Day day = Day.valueOf(input);

            switch (day) {
                case MONDAY:
                    System.out.println("Start of the work week!");
                    break;
                case FRIDAY:
                    System.out.println("Weekend is coming!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's weekend, relax!");
                    break;
                default:
                    System.out.println("Just another weekday.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }

        scanner.close();
    }
}

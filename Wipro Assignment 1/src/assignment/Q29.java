package assignment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Q29 {
    public static void main(String[] args) {
        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);
    }
}


package assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q47 {
    public static void main(String[] args) {
        // Get current date
        Date today = new Date();

        // Define formatters
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        // Display formatted dates
        System.out.println("Formatted Date (dd-MM-yyyy): " + format1.format(today));
        System.out.println("Formatted Date (full): " + format2.format(today));
    }
}

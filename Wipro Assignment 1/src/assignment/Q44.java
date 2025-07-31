package assignment;

import java.io.*;

public class Q44 {
    public static void main(String[] args) {
        String filename = "resource-demo.txt";

        // ✅ Step 1: Write to file using try-with-resources
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("This file uses try-with-resources.\n");
            writer.write("Resources are auto-closed safely.");
            System.out.println("File written using try-with-resources.");
        } catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
        }

        // ✅ Step 2: Read from file using try-with-resources
        System.out.println("\nReading file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
    }
}

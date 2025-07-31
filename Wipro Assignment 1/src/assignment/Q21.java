package assignment;

import java.io.*;

public class Q21 {
    public static void main(String[] args) {
        String filename = "sample.txt";
        String content = "This is a file handling example in Java.";

        // Writing to the file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from the file
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            System.out.println("Reading from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


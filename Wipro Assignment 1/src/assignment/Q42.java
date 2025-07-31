package assignment;

import java.io.*;

public class Q42 {
    public static void main(String[] args) {
        String filename = "data.txt";

        // ✅ Step 1: Create file with sample content if not exists
        File file = new File(filename);
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Java is awesome.\n");
                writer.write("This file was created by the program.\n");
                writer.write("We are reading it line by line.\n");
                System.out.println("File 'data.txt' created with sample content.\n");
            } catch (IOException e) {
                System.out.println("Error while creating file: " + e.getMessage());
                return;
            }
        }

        // ✅ Step 2: Read the file line by line
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


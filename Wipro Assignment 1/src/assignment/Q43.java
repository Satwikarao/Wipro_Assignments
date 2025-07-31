package assignment;

import java.io.*;

public class Q43 {
    public static void main(String[] args) {
        String filename = "data.txt";

        // ✅ Step 1: Append text to file
        try (FileWriter writer = new FileWriter(filename, true)) {  // true = append mode
            writer.write("\nAppended line 1.");
            writer.write("\nAppended line 2.");
            System.out.println("Data successfully appended to '" + filename + "'.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        // ✅ Step 2: Optional – read the file to confirm content
        System.out.println("\nReading updated file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

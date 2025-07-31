package assignment;

import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 5, 23, 89, 1};

        System.out.println("Original array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        // Sort the array
        Arrays.sort(numbers);

        System.out.println("\n\nSorted array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}


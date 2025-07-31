package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q31 {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(10, 23, 5, 46, 18, 77, 2, 90);

        // Filter even numbers and sort
        List<Integer> evenSorted = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        // Display result
        System.out.println("Filtered & Sorted Even Numbers: " + evenSorted);
    }
}

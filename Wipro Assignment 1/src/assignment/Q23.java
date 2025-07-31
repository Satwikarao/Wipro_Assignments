package assignment;

import java.util.HashMap;
import java.util.Map;

public class Q23 {
    public static void main(String[] args) {
        // Create a HashMap for employee ID and name
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // Add 5 employees
        employeeMap.put(1001, "Aarav");
        employeeMap.put(1002, "Bhavana");
        employeeMap.put(1003, "Chirag");
        employeeMap.put(1004, "Diya");
        employeeMap.put(1005, "Eshan");

        // Display all employee details
        System.out.println("Employee ID and Names:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

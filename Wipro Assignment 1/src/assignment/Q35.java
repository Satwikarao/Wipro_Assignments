package assignment;

import java.util.Vector;

public class Q35 {
    public static void main(String[] args) {
        // Create a Vector of product names
        Vector<String> products = new Vector<>();

        // Add product names
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        products.add("Keyboard");
        products.add("Monitor");

        // Display product names
        System.out.println("Product List:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}

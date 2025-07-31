package assignment;

public class Q41 {
    // Define a simple interface (no annotation)
    interface Calculator {
        double operate(double a, double b);
    }

    public static void main(String[] args) {
        // Lambda for each operation
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return a / b;
        };

        double x = 25, y = 5;

        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + sub.operate(x, y));
        System.out.println("Multiplication: " + mul.operate(x, y));
        System.out.println("Division: " + div.operate(x, y));
    }
}

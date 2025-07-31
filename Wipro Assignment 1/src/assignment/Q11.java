package assignment;

public class Q11 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(10, 5);
        calc.diff(10, 5);
        calc.mul(10, 5);
        calc.div(10, 5);
    }
}

class Calculator {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void diff(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}


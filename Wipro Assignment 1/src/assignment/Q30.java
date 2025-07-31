package assignment;

// Functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class Q30 {
    public static void main(String[] args) {
        // Lambda expression for the functional interface
        Greeting greet = (name) -> System.out.println("Hello, " + name + "!");

        // Call the method
        greet.sayHello("Satwika");
    }
}

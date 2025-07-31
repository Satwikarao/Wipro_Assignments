package assignment;

interface Greetings {
    default void sayHello() {
        System.out.println("Hello");
    }

    static void sayWorld() {
        System.out.println("World");
    }
}

public class Q17 implements Greetings {
    public static void main(String[] args) {
        Q17 obj = new Q17();
        obj.sayHello();        // from default method
        Greetings.sayWorld();  // from static method
    }
}

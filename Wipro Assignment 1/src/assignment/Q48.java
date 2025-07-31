package assignment;

public class Q48 {
    public static void main(String[] args) {
        // ✅ String to int
        String strNumber = "123";
        int number = Integer.parseInt(strNumber);
        System.out.println("String to int: " + number + " (after adding 10: " + (number + 10) + ")");

        // ✅ int to String
        int num = 456;
        String str = String.valueOf(num);
        System.out.println("int to String: " + str + " (concatenated with 'ABC': " + str + "ABC)");
    }
}

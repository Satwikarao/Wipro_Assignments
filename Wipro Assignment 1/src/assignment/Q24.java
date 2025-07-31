package assignment;

public class Q24 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // 1. Length
        System.out.println("Length of str1: " + str1.length());

        // 2. Concatenation
        String combined = str1.concat(" " + str2);
        System.out.println("Concatenated string: " + combined);

        // 3. To Upper Case
        System.out.println("Uppercase: " + combined.toUpperCase());

        // 4. Replace 'o' with '0'
        String replaced = combined.replace('o', '0');
        System.out.println("After replacing 'o' with '0': " + replaced);
    }
}


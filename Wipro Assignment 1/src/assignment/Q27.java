package assignment;

public class Q27 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Append
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(0, 4, "Core");
        System.out.println("After replace: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}


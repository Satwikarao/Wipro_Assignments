package assignment;

public class Q3 {
    public static void main(String[] args) {
        // Marks of 3 boys
        int boy1 = 85;
        int boy2 = 90;
        int boy3 = 80;

        // Marks of 3 girls
        int girl1 = 95;
        int girl2 = 88;
        int girl3 = 92;

        // Calculate average
        double boysAvg = (boy1 + boy2 + boy3) / 3.0;
        double girlsAvg = (girl1 + girl2 + girl3) / 3.0;

        // Print averages
        System.out.println("Average marks of boys: " + boysAvg);
        System.out.println("Average marks of girls: " + girlsAvg);

        // Compare and print who scored higher
        if (boysAvg > girlsAvg) {
            System.out.println("Boys have higher average.");
        } else if (girlsAvg > boysAvg) {
            System.out.println("Girls have higher average.");
        } else {
            System.out.println("Both have equal average.");
        }
    }
}

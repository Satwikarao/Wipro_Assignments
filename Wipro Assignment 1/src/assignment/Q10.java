package assignment;

public class Q10 {
    public static void main(String[] args) {
        // Check if an argument was passed
        if (args.length == 0) {
            System.out.println("Please provide the number of eggs as a command-line argument.");
            return;
        }

        // Parse the argument to an integer
        int eggs = Integer.parseInt(args[0]);

        // 1 gross = 144 eggs
        int gross = eggs / 144;
        int remainingAfterGross = eggs % 144;

        // 1 dozen = 12 eggs
        int dozen = remainingAfterGross / 12;
        int leftover = remainingAfterGross % 12;

        // Display result
        System.out.println("Your number of eggs is:");
        System.out.println(gross + " gross, " + dozen + " dozen, and " + leftover + " eggs");
    }
}

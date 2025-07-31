package assignment;

public class Q26 {
    public static void main(String[] args) {
        // Boxing (primitive to wrapper)
        int num = 50;
        Integer boxedNum = Integer.valueOf(num);  // manual boxing
        Integer autoBoxed = num;                 // auto-boxing

        // Unboxing (wrapper to primitive)
        int unboxedNum = boxedNum.intValue();    // manual unboxing
        int autoUnboxed = autoBoxed;             // auto-unboxing

        // Display results
        System.out.println("Original int: " + num);
        System.out.println("Boxed Integer: " + boxedNum);
        System.out.println("Auto-boxed Integer: " + autoBoxed);
        System.out.println("Unboxed int: " + unboxedNum);
        System.out.println("Auto-unboxed int: " + autoUnboxed);
    }
}


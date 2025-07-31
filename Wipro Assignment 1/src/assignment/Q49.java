package assignment;

public class Q49 {
    public static void main(String[] args) {
        // ✅ Create thread using lambda (Runnable)
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: Message " + i);
                try {
                    Thread.sleep(500); // pause for 0.5 sec
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        };

        // ✅ Create and start thread
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues...");
    }
}

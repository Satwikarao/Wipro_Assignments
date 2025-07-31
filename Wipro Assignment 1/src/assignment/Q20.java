package assignment;

// Thread using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From MyThread: " + i);
            try {
                Thread.sleep(500); // 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

// Thread using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From MyRunnable: " + i);
            try {
                Thread.sleep(500); // 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("MyRunnable interrupted");
            }
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        // Thread 1: extends Thread
        MyThread t1 = new MyThread();

        // Thread 2: implements Runnable
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}


package assignment;

class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double pay() {
        return 0.0; // overridden in child classes
    }

    public void displayPay() {
        System.out.println("Worker: " + name + ", Pay: ₹" + pay());
    }
}

class DailyWorker extends Worker {
    private int days;

    public DailyWorker(String name, double salaryRate, int days) {
        super(name, salaryRate);
        this.days = days;
    }

    @Override
    public double pay() {
        return salaryRate * days;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay() {
        return salaryRate * 40; // fixed 40 hours/week
    }
}

public class Q13 {
    public static void main(String[] args) {
        Worker w1 = new DailyWorker("Ravi", 800, 5);         // ₹800 per day × 5 days
        Worker w2 = new SalariedWorker("Sneha", 250);        // ₹250/hour × 40 hours

        w1.displayPay();  // Output: Worker: Ravi, Pay: ₹4000.0
        w2.displayPay();  // Output: Worker: Sneha, Pay: ₹10000.0
    }
}

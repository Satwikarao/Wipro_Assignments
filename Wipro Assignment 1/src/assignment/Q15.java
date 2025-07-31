package assignment;

public class Q15 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Aarav", 5000);

        acc1.display();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.withdraw(7000); // Testing insufficient balance
        acc1.display();
    }
}

class BankAccount {
    private int accNo;
    private String name;
    private double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance to withdraw ₹" + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        }
    }

    public void display() {
        System.out.println("Account No : " + accNo);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : ₹" + balance);
        System.out.println("---------------------------");
    }
}

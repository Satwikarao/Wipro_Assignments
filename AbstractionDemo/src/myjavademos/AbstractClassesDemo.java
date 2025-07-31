package myjavademos;

// Abstract class
abstract class Shopping {
    Shopping() {
        System.out.println("Abstract class Default Constructor!");
    }

    void offers() {
        System.out.println("10-30% discount");
    }

    abstract void paymentGateway();
    abstract void delivery();
}

// Concrete subclass
class Myntra extends Shopping {
    Myntra() {
        super(); // optional, but calls parent constructor
    }

    @Override
    void paymentGateway() {
        System.out.println("Myntra::paytm, paypal!");
    }

    @Override
    void delivery() {
        System.out.println("10 days delivery notice");
    }

    void feedback() {
        System.out.println("Good feedback!");
    }
}

// Main class
public class AbstractClassesDemo {
    public static void main(String[] args) {

        // 🔹 1st Object — Direct Myntra object
        Myntra m = new Myntra();
        m.paymentGateway();
        m.delivery();
        m.offers();
        m.feedback();

        System.out.println("----");

        // 🔹 2nd Object — Polymorphic reference
        Shopping s = new Myntra();
        s.paymentGateway();
        s.delivery();
        s.offers();
        ((Myntra) s).feedback(); // downcast to call feedback
    }
}

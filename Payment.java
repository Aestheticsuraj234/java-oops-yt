
 abstract  class Payments {
    abstract void pay(double  amount);
}


class UPI extends Payments {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CARD extends  Payments {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using CARD");
    }
}

public class Payment {
    public static void main(String[] args) {
            Payments payment1 = new UPI();
            Payments payment2 = new CARD();

            payment1.pay(1000);
            payment2.pay(2000);
    }

    
}

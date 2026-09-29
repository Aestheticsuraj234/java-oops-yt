

interface Payment {

    double PLATFORM_FEE = 2.0;

    void pay(double amount);

    default void generateReceipt(double amount) {
        logTransaction(amount);
        System.out.println(
                "Receipt generated for ₹" + amount
        );
    }

    static void paymentInfo() {
        System.out.println(
                "Payment system supports multiple payment methods."
        );
    }

    private void logTransaction(double amount) {
        System.out.println(
                "Logging transaction of ₹" + amount
        );
    }
}

interface Refundable {
    void refund(double amount);

    default void status(){
        System.out.println("Refund supported");
    }
}

class UPI implements Payment , Refundable {


    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }


    @Override
    public void refund(double amount) {
        System.out.println(
            "Refunded ₹" + amount + " to UPI"
        );
    }

   
}

class Card implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(
            "Paid ₹" + amount + " using Card"
        );
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println(
            "Card receipt generated for ₹" + amount
        );
    }
}

// enum Status {
//     PENDING,
//     SUCCESS,
//     FAILED;

// }

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);


    private final int value;

     Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    
}

// class User {
//     private final String name;
//     private final int age;

//     public User(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String name() {
//         return name;
//     }

//     public int age() {
//         return age;
//     }
    

record User(String name , int age){
        boolean isAdult(){
            return age >=18;
        }
}




public class Main {

    public static void main(String[] args) {
            Payment upi = new UPI();

        upi.pay(1000);

        upi.generateReceipt(1000);


        System.out.println();


        Payment card = new Card();

        card.pay(2000);

        card.generateReceipt(2000);


        System.out.println();

        Payment.paymentInfo();


    //    Level level = Level.HIGH;

    //    System.out.println(level.getValue());

   
    User user = new User("Rahul", 20);

    User updated = new User("Aman", 20);

    

    System.out.println(user.name());
System.out.println(user.age());
System.out.println(user.isAdult());

    }
}

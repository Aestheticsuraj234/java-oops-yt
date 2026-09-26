

class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    
}


class Student {
    private int marks;

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

       s1.setMarks(80);

       System.out.println(s1.getMarks());

    }
}
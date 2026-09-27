package Encapsulation;

public class BankAccount {
    private String name;
    private double balance;
    static String bankName = "SBI";
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if(amount > balance) {
            // Insufficient balance
            return false; // Exception 
        }

        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            return;
        }

        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}

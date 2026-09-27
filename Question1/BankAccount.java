package Question1;

public class BankAccount {
    String name;
    long accountNumber;
    double balance;
    BankAccount(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Write logic as well for the deposit");
    }

    public void withdraw(double amount) {
        System.out.println("Write logic as well for the withdraw");
    }

    public double calculateInterest() {
        double interest = balance * 1/100;

        return interest;
    }
}
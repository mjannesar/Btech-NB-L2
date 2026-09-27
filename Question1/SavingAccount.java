package Question1;

public class SavingAccount extends BankAccount{
    public SavingAccount(String name, long accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public double calculateInterest() {
        double interest = balance * 5/100;

        return interest;
    }
}

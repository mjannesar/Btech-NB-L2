package Question1;

public class CurrentAccount extends BankAccount{
    boolean isCurrent;
    public  CurrentAccount(String name, long accountNumber, double balance, boolean isCurrent) {
        super(name, accountNumber, balance);
        this.isCurrent = isCurrent;
    }

    public double calculateInterest() {
        double interest = balance * 2/100;

        return interest;
    }
}

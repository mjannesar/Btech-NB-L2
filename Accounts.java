public class Accounts {
    String name;
    long accountNumber;
    String branchName;
    double balance;


    // behaviours
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if(amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
       Accounts vidhi = new Accounts();
       System.out.println(vidhi.accountNumber+"  "+vidhi.name+"  "+vidhi.branchName);
    }
}

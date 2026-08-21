public class Account {
    String name;
    long accountNumber;
    String branchName;
    double balance;

    Account() {

    }

    Account(String name, double startingAmount) {
        balance = startingAmount;
        this.name = name;
    }

    Account(String name, long accNum, String  branch, double balance) {
        this.name = name;
        accountNumber = accNum;
        this.branchName = branch;
        this.balance = balance;
    }


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
        Account a1 = new Account();
         System.out.println(a1.accountNumber+"  "+a1.name+"  "+a1.balance);
        a1.accountNumber = 12353435;
        a1.name = "Ansh";
        a1.balance = 2000;
        a1.branchName = "Greater Noida";

        Account a2 = new Account("Mohit Bhaiya", 100000);
        Account a3 = new Account("Mehul Sir ji", 543534334, "Delhi", 50000000);
        // System.out.println(a1.accountNumber+"  "+a1.name+"  "+a1.balance);
        // System.out.println(a1.getName());
        System.out.println(a2.accountNumber+"  "+a2.name+"  "+a2.balance);
        System.out.println(a2.getName());
        System.out.println(a3.accountNumber+"  "+a3.name+"  "+a3.balance);
        System.out.println(a3.getName());
        // String s = new String();

        // String s = new String();
    }
}

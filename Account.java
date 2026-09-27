public class Account {
    // fields
    String name;
    String branchName;
    double balance;
    String uuid;

    Account() {

    }

    Account(String name, String branch, double startingAmount) {
        branchName = branch;
        this.name = name;
        balance = startingAmount;
        uuid = "abcd1";
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String getBranchName() {
        return branchName;
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Utkarsh";
        a1.branchName = "Greater Noida GLA";
        a1.uuid = "A124";
        a1.balance = 2000;
        System.out.println(a1.balance+"  "+a1.branchName+" "+a1.name);

        Account a2 = new Account("Suraj", "Mathura", 3000);
        System.out.println(a2.balance+"  "+a2.branchName+" "+a2.name);

        // Account a3 = new Account(double amount);
        // Account a4v= new Account(String name, String branchName);
        // Account a4v= new Account(double amount, String name, String branchName);
    }
}

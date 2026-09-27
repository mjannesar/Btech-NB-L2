package Question1;

import java.util.Scanner;

// Client
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user1 ----> Current Account
        // user2 -----> Saving Account
        // CurrentAccount user1 = new CurrentAccount("Praveen", 124353750, 100, true);
        // user1.deposit(100);
        // user1.withdraw(5000);
        // System.err.println(user1.calculateInterest());

        // SavingAccount user2 = new SavingAccount("Jannesar", 5454250, 100);
        // user2.deposit(42);
        // user2.withdraw(656);
        // System.out.println(user2.calculateInterest());

        BankAccount user;
        System.out.println("Enter 1 for Current and 2 for Saving");
        int choice = sc.nextInt();
        if(choice == 1) {
            user = new CurrentAccount("Praveen", 124353750, 100, true);
        } else {
            user = new SavingAccount("Jannesar", 5454250, 100);
        }

        user.deposit(5435);
        user.withdraw(6565);
       System.out.println( user.calculateInterest());
    }
}

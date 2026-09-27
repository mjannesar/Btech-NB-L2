package PaymentSystemApp;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Payment client;
        if(choice == 1) {
            // credit
            client = new CreditCard();
        } else {
            client = new UPI();
        }

        client.pay(5454);
        client.refund(43634576);
    }
}

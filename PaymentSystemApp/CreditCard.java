package PaymentSystemApp;

public class CreditCard implements Payment{
    public void pay(double amount) {
        System.out.println(
            "Card Logic Implementation"
        );
    }

    public void refund(double amount) {
        System.out.println("Card Logic Implementation");
    }
}

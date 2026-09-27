package PaymentSystemApp;

public class UPI implements Payment{
    public void pay(double amount) {
        System.out.println("UPI payment logic");
    }

    public void refund(double amount) {
        System.out.println("UPI refund logic");
    }
}

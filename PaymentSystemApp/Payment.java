package PaymentSystemApp;

/**
 * Payment
 */
public interface Payment {

    void pay(double amount);
    public abstract void refund(double amount);
}

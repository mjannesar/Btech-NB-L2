package Inheritance.PaymentApplication;

public class Order {
    Payment obj;
    public Order(Payment obj) {
        this.obj = obj;
    }
    public void placeOrder() {
        // cart items add 
        // inventory decrease

        obj.pay();
    }
}

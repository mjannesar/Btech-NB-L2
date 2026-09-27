package Inheritance.PaymentApplication;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        System.out.println("Select the payment method");
        System.out.println("1 for PhonePe, 2 For GooglePe, or Normal Payment");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Payment pay;
        if(choice == 1) {
           pay =  new Phonepe();
        } else if(choice == 2) {
           pay =  new GooglePe();
        } else {
           pay =  new Payment();
        }
        Order obj = new Order(pay);
        obj.placeOrder();
    }
}

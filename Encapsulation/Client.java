package Encapsulation;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        main(arr);
    }
    public static void main(int[] jannesar) {
        BankAccount person1 = new BankAccount();
        person1.getBalance();
        System.out.println("Heyyy");
    }
}

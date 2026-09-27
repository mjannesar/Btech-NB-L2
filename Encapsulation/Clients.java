package Encapsulation;

public class Clients {
    public static void main(String[] jannesar) {
        BankAccount person1 = new BankAccount("Praveen", 3000);

        BankAccount person2 = new BankAccount("Jannesar", 2000);
        
        person1.deposit(5000);
        person2.deposit(-5000);
        System.out.println(person1.getName()+"  "+person1.getBalance());
        System.out.println(person2.getName()+"  "+person2.getBalance());
    }
}

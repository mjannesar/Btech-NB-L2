package Abstraction;

public class Client {
    public static void main(String[] args) {
        database client = new GlaDatabase();
        client = new MySql();
        client.insert(100);
        client = new Oracle();
        client.insert(200);
    }
}

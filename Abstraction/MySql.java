package Abstraction;

public class MySql implements database{
    public void insert(int a) {
        // n lines of code
        System.out.println("This is MySQL Logic");
    }

    public int remove(int nandini){
        System.out.println("This is MYSQL remove logic");
        return -1;
    }
        public boolean find(int a) {
        return true;
    }

    public void update(int a) {
        System.out.println("This is the MySQL logic");
    }

}

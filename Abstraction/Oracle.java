package Abstraction;

public class Oracle implements database{
    public void insert(int a) {
        System.out.println("This is the Oracle logic");
    }

    public int remove(int b) {
        System.out.println("This is the Oracle logic");
        return -1;
    }
    
    public boolean find(int a) {
        return true;
    }

    public void update(int a) {
        System.out.println("This is the Oracle logic");
    }
}

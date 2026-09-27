package Abstraction;

public class GlaDatabase implements database{
    public void insert(int x) {
        System.out.println("Gla Database logic");
    }

    public int remove(int nandini){
        System.out.println("This is gla  remove logic");
        return -1;
    }
        public boolean find(int a) {
        return true;
    }

    public void update(int a) {
        System.out.println("This is the gLA logic");
    }
}

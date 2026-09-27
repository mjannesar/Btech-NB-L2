package Abstraction;

/**
 * database
 */
// JDBC API
// contract
public interface database {

     void insert(int a); // public abstract void insert(int a);
     public int remove(int a); // public abstract int remove(int a);
     abstract boolean find(int a);
     public abstract void update(int a);
}

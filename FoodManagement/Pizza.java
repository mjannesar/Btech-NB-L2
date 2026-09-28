package FoodManagement;

public class Pizza extends FoodItem implements Deliverable{
    String shape;
    
    Pizza(String name, double price, int quantity, String shape) {
        super(name, price, quantity);
        this.shape = shape;
    }

    public void calculateBill() {
        System.out.println("This is the biryani bill");
    }

    public void deliver() {
        System.out.println("Biryani Deivered.....");
    }
}

package FoodManagement;

public class Burger extends FoodItem implements Deliverable{
    private boolean isVeg;
    
    Burger(String name, double price, int quantity, boolean isVeg) {
        super(name, price, quantity);
        this.isVeg = isVeg;
    }

    public void calculateBill() {
        System.out.println("This is the biryani bill");
    }

    public void deliver() {
        System.out.println("Biryani Deivered.....");
    }
}

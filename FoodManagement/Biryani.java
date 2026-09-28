package FoodManagement;

public class Biryani extends FoodItem implements Deliverable{
    private String type;
    
    Biryani(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }

    public void calculateBill() {
        System.out.println("This is the biryani bill");
    }

    public void deliver() {
        System.out.println("Biryani Deivered.....");
    }
}

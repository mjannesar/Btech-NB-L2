package FoodManagement;

public abstract class FoodItem {
    private String name;
    private double price;
    private int quantity;
    FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract void calculateBill();

    public void displayItem() {
        System.out.println("Food Item Details");
        System.out.println("Name of the item: "+name);
        System.out.println("Price of the item: "+price);
        System.out.println("Quantity of the item: "+quantity);
    }
}

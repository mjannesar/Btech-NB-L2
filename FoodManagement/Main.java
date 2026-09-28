package FoodManagement;

public class Main {

    public static void main(String[] args) {

        FoodItem pizza = new Pizza("Margherita Pizza", 300, 5, 
            "Square"
        );

        FoodItem burger = new Burger("Cheese Burger", 150, 4, false);

        FoodItem biryani = new Biryani("Chicken Biryani", 250, 10, "Chicken");

        System.out.println("===== PIZZA DETAILS =====");

        pizza.displayItem();

        Deliverable pizzaDelivery = (Deliverable) pizza;
        pizzaDelivery.deliver();

        System.out.println();

        System.out.println("===== BURGER DETAILS =====");

        burger.displayItem();

        Deliverable burgerDelivery = (Deliverable) burger;
        burgerDelivery.deliver();

        System.out.println();

        System.out.println("===== BIRYANI DETAILS =====");

        biryani.displayItem();

        Deliverable biryaniDelivery = (Deliverable) biryani;
        biryaniDelivery.deliver();
    }
}

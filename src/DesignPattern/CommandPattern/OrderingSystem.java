package DesignPattern.CommandPattern;

public class OrderingSystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.placeOrder(new DishOrder(new Dish("French Fries", 1200, "Potato,Red Sauce")));
        order.placeOrder(new DishOrder(new Dish("Peperoni Pizza", 2500, "Peperoni, Cheddar cheese, Tomato")));
        order.placeOrder(new DishOrder(new Dish("Caramel Cream", 700, "Caramel Powder, Milk")));

        System.out.println("Bill price is " + order.calculate());
    }
}

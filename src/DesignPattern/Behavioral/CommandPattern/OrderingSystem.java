package DesignPattern.Behavioral.CommandPattern;

public class OrderingSystem {
    public static void main(String[] args) {
        Order order = new Order();
        order.placeOrder(Menu.FrenchFries.getOrder());
        order.placeOrder(Menu.Peperoni.getOrder());
        order.placeOrder(Menu.CaramelCream.getOrder());

        System.out.println("Bill price is " + order.calculate());
    }
}

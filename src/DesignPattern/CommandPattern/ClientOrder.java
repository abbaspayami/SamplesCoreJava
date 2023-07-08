package DesignPattern.CommandPattern;

public class ClientOrder implements OrderFactory {

    @Override
    public OrderCommand createOrder(String typeOrder, String nameOrder) {

        if (typeOrder.equalsIgnoreCase("dish")) {
            if (nameOrder.equalsIgnoreCase("Peperoni Pizza")) {
                return new DishOrder(new Dish("Peperoni Pizza", 2500, "Peperoni, Cheddar cheese, Tomato"));
            } else if (typeOrder.equalsIgnoreCase("French Fries")) {
                new DishOrder(new Dish("French Fries", 1200, "Potato,Red Sauce"));
            } else if (typeOrder.equalsIgnoreCase("Caramel Cream")) {
                new DishOrder(new Dish("Caramel Cream", 700, "Caramel Powder, Milk"));
            }
        } else if (typeOrder.equalsIgnoreCase("sandwich")) {

        } else if (typeOrder.equalsIgnoreCase("drink")) {

        }

        return null;

    }
}

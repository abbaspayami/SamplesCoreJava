package DesignPattern.CommandPattern;

import java.util.HashMap;
import java.util.Map;

public class StringOrderFactory implements OrderFactory {
    private static final Map<String, OrderCommand> MENU;

    static {
        MENU = new HashMap<>();
        MENU.put("pizza|pepperoni", new DishOrder(new Dish("Pepperoni Pizza", 2500, "Cheese,Peperoni")));
        MENU.put("pizza|cheese", new DishOrder(new Dish("Cheese Pizza", 1500, "Cheese")));
        MENU.put("drink|coca cola", new DrinkOrder(new Drink("CocaCola", 1500, 1)));
        MENU.put("sandwich|big-mag", new SandwichOrder(new Sandwich("Big-Mag", 1500, 1)));
    }

    @Override
    public OrderCommand createOrder(String typeOrder, String nameOrder) {
        return MENU.get(typeOrder + "|" + nameOrder);
    }
}

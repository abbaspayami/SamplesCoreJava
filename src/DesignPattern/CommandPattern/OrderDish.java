package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderDish {
    private final List<Dish> dishs = new ArrayList<>();

    public void placeOrder(Dish dish) {
        dishs.add(dish);
        System.out.println(dish.getName() + "is Ordered");
    }


    public int calculateDish() {
        return dishs.stream().
                map(Dish::getPrice).
                reduce(Integer::sum).
                orElse(0);
    }
}

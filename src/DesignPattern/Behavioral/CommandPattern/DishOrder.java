package DesignPattern.Behavioral.CommandPattern;

public class DishOrder implements OrderCommand {
    private Dish dish;

    public DishOrder(Dish dish) {
        this.dish = dish;
    }

    @Override
    public int calcPrice() {
        return this.dish.getPrice();
    }

    @Override
    public String getName() {
        return dish.getName();
    }
}

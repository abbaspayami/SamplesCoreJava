package DesignPattern.Behavioral.CommandPattern;

public class DrinkOrder implements OrderCommand {

   private final Drink drink;

    public DrinkOrder(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int calcPrice() {
        return this.drink.getPrice();
    }

    @Override
    public String getName() {
        return drink.getName();
    }
}

package DesignPattern.CommandPattern;

public class SandwichOrder implements OrderCommand{
    private Sandwich sandwich;

    public SandwichOrder(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public int calcPrice() {
        return sandwich.getPrice();
    }

    @Override
    public String getName() {
        return sandwich.getName();
    }
}

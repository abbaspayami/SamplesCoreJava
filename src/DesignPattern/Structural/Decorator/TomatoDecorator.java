package DesignPattern.Structural.Decorator;

public class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1000;
    }
}

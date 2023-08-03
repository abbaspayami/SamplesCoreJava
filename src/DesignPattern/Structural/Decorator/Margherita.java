package DesignPattern.Structural.Decorator;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getCost() {
        return 2500;
    }
}

package DesignPattern.Structural.Decorator;

public class MainDecorator {
    public static void main(String[] args) {

        Pizza margaritaPizza = new Margherita();
        margaritaPizza = new CheeseDecorator(margaritaPizza);
        margaritaPizza = new TomatoDecorator(margaritaPizza);

        System.out.println(margaritaPizza.getDescription());
        System.out.println(margaritaPizza.getCost());
    }
}

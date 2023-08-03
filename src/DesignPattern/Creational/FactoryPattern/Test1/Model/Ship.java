package DesignPattern.Creational.FactoryPattern.Test1.Model;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship is delivering...");

    }
}

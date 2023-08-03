package DesignPattern.Creational.AbstractFactory.Model;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian chair Sitting ...");
    }
}

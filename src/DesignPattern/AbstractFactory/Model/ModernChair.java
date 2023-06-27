package DesignPattern.AbstractFactory.Model;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Modern Chair sitting ...");
    }
}

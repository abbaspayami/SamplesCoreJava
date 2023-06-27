package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.Factory.FurnitureFactory;
import DesignPattern.AbstractFactory.Factory.ModernFurnitureFactory;
import DesignPattern.AbstractFactory.Model.Chair;

public class MainAbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair chair =modernFactory.createChair();
        System.out.println(chair.hasLegs());
        chair.sitOn();
    }
}

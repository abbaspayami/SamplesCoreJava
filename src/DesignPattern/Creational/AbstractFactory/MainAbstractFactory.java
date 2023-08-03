package DesignPattern.Creational.AbstractFactory;

import DesignPattern.Creational.AbstractFactory.Factory.FurnitureFactory;
import DesignPattern.Creational.AbstractFactory.Factory.ModernFurnitureFactory;
import DesignPattern.Creational.AbstractFactory.Model.Chair;

public class MainAbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair chair =modernFactory.createChair();
        System.out.println(chair.hasLegs());
        chair.sitOn();
    }
}

package DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap;

import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Shape;

public class MainFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("rectangle");
        circle.draw();

    }
}

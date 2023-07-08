package DesignPattern.FactoryPattern.FactoryPatternShap;

import DesignPattern.FactoryPattern.FactoryPatternShap.model.Shape;

public class MainFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

    }
}

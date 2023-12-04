package DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap;

import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Shape;

public class MainFactory {
    public static void main(String[] args) {
        Shape circleFactory = new CircleFactory().createShape();
        circleFactory.draw();

    }
}

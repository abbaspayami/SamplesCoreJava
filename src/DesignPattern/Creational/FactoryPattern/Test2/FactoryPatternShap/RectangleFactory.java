package DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap;

import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Rectangle;
import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Shape;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

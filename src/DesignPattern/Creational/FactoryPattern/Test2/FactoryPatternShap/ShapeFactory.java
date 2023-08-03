package DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap;

import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Circle;
import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Rectangle;
import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Shape;

public class ShapeFactory implements ShapeCreator{

    @Override
    public Shape createShape(Object input) {
        if (!(input instanceof String)) {
            throw new ClassCastException();
        }
        String s = input.toString();
        if (s.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (s.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}

package DesignPattern.FactoryPattern.FactoryPatternShap;

import DesignPattern.FactoryPattern.FactoryPatternShap.model.Circle;
import DesignPattern.FactoryPattern.FactoryPatternShap.model.Rectangle;
import DesignPattern.FactoryPattern.FactoryPatternShap.model.Shape;

public class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }

}

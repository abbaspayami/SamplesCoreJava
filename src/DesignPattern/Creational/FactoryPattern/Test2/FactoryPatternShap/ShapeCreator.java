package DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap;

import DesignPattern.Creational.FactoryPattern.Test2.FactoryPatternShap.model.Shape;

public interface ShapeCreator {

    Shape createShape(Object input);

}

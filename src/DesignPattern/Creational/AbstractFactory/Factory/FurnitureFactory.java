package DesignPattern.Creational.AbstractFactory.Factory;

import DesignPattern.Creational.AbstractFactory.Model.Chair;
import DesignPattern.Creational.AbstractFactory.Model.Sofa;
import DesignPattern.Creational.AbstractFactory.Model.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();

}

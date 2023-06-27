package DesignPattern.AbstractFactory.Factory;

import DesignPattern.AbstractFactory.Model.Chair;
import DesignPattern.AbstractFactory.Model.Sofa;
import DesignPattern.AbstractFactory.Model.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();

}

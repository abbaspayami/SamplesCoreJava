package DesignPattern.Creational.FactoryPattern.Test1.Factory;

import DesignPattern.Creational.FactoryPattern.Test1.Model.Transport;
import DesignPattern.Creational.FactoryPattern.Test1.Model.TransportEnum;

public interface TransportCreator {
    Transport createTransport(Object input);
}

package DesignPattern.Creational.FactoryPattern.Test1.Factory;

import DesignPattern.Creational.FactoryPattern.Test1.Model.Transport;

public interface TransportCreator {
    Transport createTransport(Object input);
}

package DesignPattern.FactoryPattern.Factory;

import DesignPattern.FactoryPattern.Model.Transport;

public interface TransportCreator {
    Transport createTransport(Object input);
}

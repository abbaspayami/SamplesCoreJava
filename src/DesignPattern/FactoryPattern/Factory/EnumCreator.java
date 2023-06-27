package DesignPattern.FactoryPattern.Factory;

import DesignPattern.FactoryPattern.Model.Ship;
import DesignPattern.FactoryPattern.Model.Transport;
import DesignPattern.FactoryPattern.Model.TransportEnum;
import DesignPattern.FactoryPattern.Model.Truck;

public class EnumCreator implements TransportCreator {
    @Override
    public Transport createTransport(Object input) {
        if (!(input instanceof TransportEnum)) {
            throw new ClassCastException();
        }
        if (input == TransportEnum.Truck) {
            return new Truck();
        } else if (input == TransportEnum.Ship) {
            return new Ship();
        }
        return null;
    }
}

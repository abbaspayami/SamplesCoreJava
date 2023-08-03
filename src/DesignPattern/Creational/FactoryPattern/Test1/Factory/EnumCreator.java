package DesignPattern.Creational.FactoryPattern.Test1.Factory;

import DesignPattern.Creational.FactoryPattern.Test1.Model.Ship;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Transport;
import DesignPattern.Creational.FactoryPattern.Test1.Model.TransportEnum;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Truck;

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

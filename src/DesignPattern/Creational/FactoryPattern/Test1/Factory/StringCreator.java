package DesignPattern.Creational.FactoryPattern.Test1.Factory;

import DesignPattern.Creational.FactoryPattern.Test1.Model.Ship;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Transport;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Truck;

public class StringCreator implements TransportCreator {
    @Override
    public Transport createTransport(Object input) throws ClassCastException{

        if (!(input instanceof String)) {
            throw new ClassCastException();
        }
        String s = input.toString();
        if (s.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (s.equalsIgnoreCase("ship")) {
            return new Ship();
        }
        return null;
    }
}

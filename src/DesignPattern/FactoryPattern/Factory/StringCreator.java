package DesignPattern.FactoryPattern.Factory;

import DesignPattern.FactoryPattern.Model.Ship;
import DesignPattern.FactoryPattern.Model.Transport;
import DesignPattern.FactoryPattern.Model.Truck;

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

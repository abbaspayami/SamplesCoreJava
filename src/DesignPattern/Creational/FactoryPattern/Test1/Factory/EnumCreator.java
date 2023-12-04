package DesignPattern.Creational.FactoryPattern.Test1.Factory;

import DesignPattern.Creational.FactoryPattern.Test1.Model.Ship;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Transport;
import DesignPattern.Creational.FactoryPattern.Test1.Model.TransportEnum;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Truck;

import java.util.List;

public class EnumCreator implements TransportCreator {

//    @Autowired
//    List<Transport> list;
    @Override
    public Transport createTransport(Object input) {
//        for (Transport transport : list) {
//            if (transport.isMe((TransportEnum) input))
//                return transport;
//        }
//        throw new IllegalArgumentException();
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

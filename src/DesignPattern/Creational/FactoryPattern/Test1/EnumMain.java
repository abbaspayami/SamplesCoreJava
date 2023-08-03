package DesignPattern.Creational.FactoryPattern.Test1;

import DesignPattern.Creational.FactoryPattern.Test1.Factory.EnumCreator;
import DesignPattern.Creational.FactoryPattern.Test1.Model.Transport;
import DesignPattern.Creational.FactoryPattern.Test1.Model.TransportEnum;

import java.util.ArrayList;
import java.util.List;

public class EnumMain {

    public static void main(String[] args) {

        List<TransportEnum> transportEnums = new ArrayList<>();
        transportEnums.add(TransportEnum.Ship);
        transportEnums.add(TransportEnum.Truck);
        transportEnums.add(TransportEnum.Ship);

        transportEnums.forEach(System.out::println);


        EnumCreator enumCreator = new EnumCreator();
        List<Transport> transports = new ArrayList<>();

        transportEnums.forEach(transportEnum -> {
            Transport transport = enumCreator.createTransport(transportEnum);
            transports.add(transport);
        });

        transports.forEach(Transport::deliver);
    }

}

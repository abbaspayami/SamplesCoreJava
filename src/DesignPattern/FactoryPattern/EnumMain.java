package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.Factory.EnumCreator;
import DesignPattern.FactoryPattern.Model.Transport;
import DesignPattern.FactoryPattern.Model.TransportEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

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

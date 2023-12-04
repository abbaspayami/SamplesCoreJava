package DesignPattern.Creational.FactoryPattern.Test1.Model;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck is delivering..");
    }

//    @Override
//    public boolean isMe(TransportEnum en) {
//        return TransportEnum.Truck.equals(en);
//    }
}

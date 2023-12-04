package DesignPattern.Creational.FactoryPattern.Test4;


import DesignPattern.Creational.FactoryPattern.Test4.model.MessageType;
import DesignPattern.Creational.FactoryPattern.Test4.service.MessageFactory;
import DesignPattern.Creational.FactoryPattern.Test4.service.SmartMessageFactory;

public class MessageFactoryTest {
    public static void main(String[] args) {
        MessageFactory messageFactory = new SmartMessageFactory();
        System.out.println(messageFactory.createMessage(MessageType.SMS, "Hello", "World"));
        System.out.println(messageFactory.createMessage(MessageType.Email, "Hello", "World"));
    }
}

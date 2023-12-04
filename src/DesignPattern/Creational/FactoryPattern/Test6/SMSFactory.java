package DesignPattern.Creational.FactoryPattern.Test6;

public class SMSFactory implements MessageFactory {
    @Override
    public Message createMessage(Object... args) {
        return new SMS((String) args[0], (String) args[1]);
    }
}

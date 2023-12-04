package DesignPattern.Creational.FactoryPattern.Test6;

public class EmailFactory implements MessageFactory{
    @Override
    public Message createMessage(Object... args) {
        return new Email((String) args[0], (String) args[1]);
    }
}

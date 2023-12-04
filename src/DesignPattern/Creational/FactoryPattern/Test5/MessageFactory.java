package DesignPattern.Creational.FactoryPattern.Test5;

import DesignPattern.Creational.FactoryPattern.Test6.Email;
import DesignPattern.Creational.FactoryPattern.Test6.Message;
import DesignPattern.Creational.FactoryPattern.Test6.SMS;

public class MessageFactory {

    public static Message createMessage(MessageType messageType, Object... args) {

        switch (messageType) {
            case Email:
                return new Email((String) args[0], (String) args[1]);
            case SMS:
                return new SMS((String) args[0], (String) args[1]);
            default:
                throw new IllegalArgumentException("Unknown message type: " + messageType);
        }

    }

}

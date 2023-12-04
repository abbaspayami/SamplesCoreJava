package DesignPattern.Creational.FactoryPattern.Test5;

import DesignPattern.Creational.FactoryPattern.Test6.Message;

public class MessageSendingMain {

    public static void main(String[] args) {
        Message emil = MessageFactory.createMessage(MessageType.Email, "john@example.com", "Hello, this is an email!");
        emil.send();

        Message sms = MessageFactory.createMessage(MessageType.SMS, "+123456789", "Hello, this is an SMS!");
        sms.send();
    }

}

package DesignPattern.Creational.FactoryPattern.Test6;

public class MessageSendingExample {

    public static void main(String[] args) {
        MessageFactory emailFactory = new EmailFactory();
        Message email = emailFactory.createMessage("john@example.com", "Hello, this is an email!");
        email.send();

        MessageFactory smsFactory = new SMSFactory();
        Message sms = smsFactory.createMessage("+123456789", "Hello, this is an SMS!");
        sms.send();
    }

}

package DesignPattern.Creational.FactoryPattern.Test3.model;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Send SMS...");
    }
}

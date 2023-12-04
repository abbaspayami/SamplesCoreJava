package DesignPattern.Creational.FactoryPattern.Test3.model;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Send Email...");
    }
}

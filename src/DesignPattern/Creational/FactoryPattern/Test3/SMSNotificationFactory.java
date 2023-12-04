package DesignPattern.Creational.FactoryPattern.Test3;

import DesignPattern.Creational.FactoryPattern.Test3.model.Notification;
import DesignPattern.Creational.FactoryPattern.Test3.model.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

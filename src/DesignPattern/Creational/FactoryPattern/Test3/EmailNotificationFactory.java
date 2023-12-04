package DesignPattern.Creational.FactoryPattern.Test3;

import DesignPattern.Creational.FactoryPattern.Test3.model.EmailNotification;
import DesignPattern.Creational.FactoryPattern.Test3.model.Notification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

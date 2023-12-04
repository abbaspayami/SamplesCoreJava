package DesignPattern.Creational.FactoryPattern.Test3;

import DesignPattern.Creational.FactoryPattern.Test3.model.EmailNotification;
import DesignPattern.Creational.FactoryPattern.Test3.model.Notification;

public class MainClass {

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        email.sendNotification();

        Notification emailNotification = new EmailNotificationFactory().createNotification();
        emailNotification.sendNotification();


        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification notification = emailFactory.createNotification();
        notification.sendNotification();

        Notification smsNotification = new SMSNotificationFactory().createNotification();
        smsNotification.sendNotification();
    }


}

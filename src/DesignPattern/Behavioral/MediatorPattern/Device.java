package DesignPattern.Behavioral.MediatorPattern;

public abstract class Device {

    protected String id;

    protected HomeAutomationMediator homeAutomationMediator;

    public Device(String id, HomeAutomationMediator homeAutomationMediator) {
        this.id = id;
        this.homeAutomationMediator = homeAutomationMediator;
    }

    public void receiveNotification(Device device, String event) {
        System.out.println("receiver: " + this.id + " Sender Id: " + device.id + " Event : " + event);
    }

    protected void sendNotification(String event) {
        this.homeAutomationMediator.notify(this, event);
    }

}

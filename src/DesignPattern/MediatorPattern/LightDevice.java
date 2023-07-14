package DesignPattern.MediatorPattern;

public class LightDevice extends Device implements Light {


    public LightDevice(String id, HomeAutomationMediator homeAutomationMediator) {
        super(id, homeAutomationMediator);
    }

    @Override
    public void setOff() {
        System.out.println("Light is set off");
        sendNotification("setOff");
    }

    @Override
    public void setOn() {
        System.out.println("Light is on...");
        sendNotification("setOn");
    }
}

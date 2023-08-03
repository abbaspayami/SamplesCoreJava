package DesignPattern.Behavioral.MediatorPattern;

public class SecurityCameraDevice extends Device implements Camera{



    public SecurityCameraDevice(String id, HomeAutomationMediator homeAutomationMediator) {
        super(id, homeAutomationMediator);
    }


    @Override
    public void startRecord() {
        System.out.println("Camera Start recording...");
        this.sendNotification("Start record");
    }

    @Override
    public void stopRecord() {
        System.out.println("Camera stop recording");
        this.sendNotification("Stop record");
    }
}

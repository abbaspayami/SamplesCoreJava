package DesignPattern.MediatorPattern;

public interface HomeAutomationMediator {

    void notify(Device device, String event);

    void registerDevice(Device device);

}

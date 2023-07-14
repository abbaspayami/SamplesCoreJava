package DesignPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationMediatorImpl implements HomeAutomationMediator{

    List<Device> devices = new ArrayList<>();

    @Override
    public void notify(Device device, String event) {
        for (Device de: devices) {
            if (!de.equals(device)) {
                de.receiveNotification(device, event);
            }
        }
    }

    @Override
    public void registerDevice(Device device) {
        devices.add(device);
    }
}

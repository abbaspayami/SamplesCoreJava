package DesignPattern.MediatorPattern;

public class MainMediator {
    public static void main(String[] args) {

        HomeAutomationMediator home = new HomeAutomationMediatorImpl();
        LightDevice light = new LightDevice("light1", home);
        SecurityCameraDevice SecurityCamera = new SecurityCameraDevice("camera1", home);
        Device thermo = new ThermostatDevice("termo1", home);

        home.registerDevice(light);
        home.registerDevice(SecurityCamera);
        home.registerDevice(thermo);

        light.setOn();
        SecurityCamera.startRecord();

        light.setOff();
        SecurityCamera.stopRecord();

    }
}

package DesignPattern.Observer;

public class WindSpeedDisplay implements Display<Integer> {

    private final WeatherStation station;

    public WindSpeedDisplay(WeatherStation station) {
        this.station = station;
        this.station.registerWindChange(this);
    }


    @Override
    public void update(Integer value) {
        System.out.println("Wind is changed : " + value);
    }
}

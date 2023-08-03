package DesignPattern.Behavioral.Observer;

public class HumidityDisplay implements Display<Integer> {
    private final WeatherStation station;

    public HumidityDisplay(WeatherStation station) {
        this.station = station;
        station.registerHumidityChange(this);
    }


    @Override
    public void update(Integer value) {
        System.out.println("Humidity is change to " + value);
    }
}

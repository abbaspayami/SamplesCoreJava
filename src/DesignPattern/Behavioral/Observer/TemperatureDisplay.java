package DesignPattern.Behavioral.Observer;

public class TemperatureDisplay implements Display<Integer> {

    private final WeatherStation station;

    public TemperatureDisplay(WeatherStation station) {
        this.station = station;
        this.station.registerTemperatureChange(this);
    }


    @Override
    public void update(Integer value) {
        System.out.println("Temperature is changed to :" + value);

    }
}

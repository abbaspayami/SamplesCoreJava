package DesignPattern.Observer;

public class MainObserver {

    public static void main(String[] args) {
        WeatherStation yerevanWeatherStation = new YerevanWeatherStation();
        Display<Integer> temperatureDisplayImpl = new TemperatureDisplay(yerevanWeatherStation);
        Display<Integer> humidityDisplay = new HumidityDisplay(yerevanWeatherStation);
        Display<Integer> windSpeedDisplay = new WindSpeedDisplay(yerevanWeatherStation);

        yerevanWeatherStation.changeWeather(40,50,30);
        yerevanWeatherStation.changeWeather(40,51,30);
        yerevanWeatherStation.changeWeather(37,51,30);
        yerevanWeatherStation.changeWeather(37,51,32);

    }

}

package DesignPattern.Observer;

public interface WeatherStation {

    void registerWindChange(Display<Integer> observer);
    void unregisterWindChange(Display<Integer> observer);
    void notifyWindChange(int wind);

    void registerTemperatureChange(Display<Integer> observer);
    void unregisterTemperatureChange(Display<Integer> observer);
    void notifyTemperatureChange(int temperature);

    void registerHumidityChange(Display<Integer> observer);
    void unregisterHumidityChange(Display<Integer> observer);
    void notifyHumidityChange(int humidity);

    void changeWeather(int temperature,int windSpeed,int humidity);


}

package DesignPattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class YerevanWeatherStation implements WeatherStation {
    List<Display<Integer>> temperatureDisplays = new ArrayList<>();
    List<Display<Integer>> humidityDisplays = new ArrayList<>();
    List<Display<Integer>> windDisplays = new ArrayList<>();

    int temperature;
    int humidity;
    int windSpeed;

    @Override
    public void registerWindChange(Display<Integer> observer) {
        if (observer != null)
            windDisplays.add(observer);
    }

    @Override
    public void unregisterWindChange(Display<Integer> observer) {
        if (observer != null)
            windDisplays.remove(observer);

    }

    @Override
    public void notifyWindChange(int wind) {
        windDisplays.forEach(windDisplay -> windDisplay.update(wind));
    }

    @Override
    public void registerTemperatureChange(Display<Integer> observer) {
        if (observer != null)
            temperatureDisplays.add(observer);

    }

    @Override
    public void unregisterTemperatureChange(Display<Integer> observer) {
        if (observer != null)
            temperatureDisplays.remove(observer);

    }

    @Override
    public void notifyTemperatureChange(int temperature) {
        temperatureDisplays.forEach(temperatureDisplay -> temperatureDisplay.update(temperature));
    }

    @Override
    public void registerHumidityChange(Display<Integer> observer) {
        if (observer != null)
            humidityDisplays.add(observer);
    }

    @Override
    public void unregisterHumidityChange(Display<Integer> observer) {
        if (observer != null)
            humidityDisplays.remove(observer);
    }

    @Override
    public void notifyHumidityChange(int humidity) {
        humidityDisplays.forEach(humidityDisplay -> humidityDisplay.update(humidity));
    }

    @Override
    public void changeWeather(int temperature, int windSpeed, int humidity) {
        if (this.humidity != humidity) {
            this.setHumidity(humidity);
        }
        if (this.windSpeed != windSpeed) {
            this.setWindSpeed(windSpeed);
        }
        if (this.temperature != temperature) {
            this.setTemperature(temperature);
        }
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyTemperatureChange(temperature);
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyHumidityChange(humidity);
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
        notifyWindChange(windSpeed);
    }
}

package stankevich.patterns.structural.adapter;

public class ThirdPartyWeatherData {
    public final double tempF; // Температура в Фаренгейтах
    public final Location locationData; // Вложенный объект

    public ThirdPartyWeatherData(double tempF, Location locationData) {
        this.tempF = tempF;
        this.locationData = locationData;
    }
}

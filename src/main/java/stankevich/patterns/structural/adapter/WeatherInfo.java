package stankevich.patterns.structural.adapter;

public class WeatherInfo {
    private final String city;
    private final double temperatureCelsius;

    public WeatherInfo(String city, double temperatureCelsius) {
        this.city = city;
        this.temperatureCelsius = temperatureCelsius;
    }

    @Override
    public String toString() {
        return "Погода в городе " + city + ": " + temperatureCelsius + " °C";
    }
}

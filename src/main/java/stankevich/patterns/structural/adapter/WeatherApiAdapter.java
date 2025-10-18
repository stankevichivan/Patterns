package stankevich.patterns.structural.adapter;

public class WeatherApiAdapter implements WeatherService{

    private final ThirdPartyWeatherApiClient apiClient;

    public WeatherApiAdapter(ThirdPartyWeatherApiClient client) {
        this.apiClient = client;
    }

    @Override
    public WeatherInfo getWeather(String city) {
        ThirdPartyWeatherData externalData = apiClient.fetchWeather(city);

        double tempCelsius = (externalData.tempF - 32) * 5 / 9.0;
        String cityName = externalData.locationData.cityName;

        return new WeatherInfo(cityName, Math.round(tempCelsius));
    }
}

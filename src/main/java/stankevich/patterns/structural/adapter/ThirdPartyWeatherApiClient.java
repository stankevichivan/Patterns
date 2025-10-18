package stankevich.patterns.structural.adapter;

public class ThirdPartyWeatherApiClient {

    public ThirdPartyWeatherData fetchWeather(String city) {
        System.out.println("API-ЗАПРОС: Получение данных от стороннего сервиса для города " + city);

        return new ThirdPartyWeatherData(77.0, new Location(city));
    }
}

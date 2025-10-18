package stankevich.patterns.structural.adapter;


public class ARunner {
    public static void main(String[] args) {
        ThirdPartyWeatherApiClient externalApiClient = new ThirdPartyWeatherApiClient();

        WeatherService service = new WeatherApiAdapter(externalApiClient);

        WeatherInfo info = service.getWeather("Москва");

        System.out.println("РЕЗУЛЬТАТ: " + info);
    }
}

package stankevich.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TourFactory {
    private static final Map<String, Tour> tours = new HashMap<>();

    private TourFactory() {
        throw new AssertionError("forbidden");
    }

    public static Tour getTour(String country) {
        Tour tour = tours.get(country);
        if (tour == null) {
            System.out.println("creating tour");
            tour = switch (country) {
                case "turkey" -> new TurkeyTour();
                case "egypt" -> new EgyptTour();
                default -> null;
            };
            tours.put(country, tour);
        }
        return tour;
    }
}

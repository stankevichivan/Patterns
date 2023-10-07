package stankevich.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightRunner {
    public static void main(String[] args) {
        List<Tour> tours = new ArrayList<>();
        tours.add(TourFactory.getTour("turkey"));
        tours.add(TourFactory.getTour("turkey"));
        tours.add(TourFactory.getTour("turkey"));
        tours.add(TourFactory.getTour("turkey"));
        tours.add(TourFactory.getTour("turkey"));
        tours.add(TourFactory.getTour("egypt"));
        tours.add(TourFactory.getTour("egypt"));
        tours.add(TourFactory.getTour("egypt"));
        tours.add(TourFactory.getTour("egypt"));
        tours.add(TourFactory.getTour("egypt"));
        tours.add(TourFactory.getTour("egypt"));

        System.out.println(tours.size());

        tours.forEach(Tour::relax);
    }
}

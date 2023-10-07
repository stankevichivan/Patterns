package stankevich.patterns.structural.flyweight;

public class TurkeyTour implements Tour {

    @Override
    public void relax() {
        System.out.println("relax in turkey");
    }
}

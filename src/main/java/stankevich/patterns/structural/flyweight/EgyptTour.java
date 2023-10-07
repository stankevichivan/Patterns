package stankevich.patterns.structural.flyweight;

public class EgyptTour implements Tour{
    @Override
    public void relax() {
        System.out.println("relax in egypt");
    }
}

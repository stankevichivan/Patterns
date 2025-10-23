package stankevich.patterns.structural.decorator;

public class Espresso implements Coffee {

    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }
}

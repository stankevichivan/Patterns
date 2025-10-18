package stankevich.patterns.structural.decorator;

public class WithMilk extends CoffeeDecorator{

    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с молоком";
    }
}

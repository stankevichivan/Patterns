package stankevich.patterns.structural.decorator;

public class WithSyrup extends CoffeeDecorator{

    public WithSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с сиропом";
    }
}

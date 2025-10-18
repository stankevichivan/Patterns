package stankevich.patterns.structural.decorator;

/* Базовый класс для всех декораторов. Он реализует интерфейс Coffee и хранит ссылку на оборачиваемый объект.*/
abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}

package stankevich.patterns.structural.decorator;

public class DRunner {
    public static void main(String[] args) {
        Coffee myCoffee = new Espresso();
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());

        myCoffee = new WithMilk(myCoffee);
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());

        myCoffee = new WithSyrup(myCoffee);
        System.out.println(myCoffee.getDescription() + " - $" + myCoffee.getCost());

        Coffee coffeeWithSyrup = new WithSyrup(new Espresso());
        System.out.println(coffeeWithSyrup.getDescription() + " - $" + coffeeWithSyrup.getCost());
    }
}

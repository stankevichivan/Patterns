package stankevich.patterns.behavioral.strategy.old;

public class SignDocument implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Signing document ...");
    }
}

package stankevich.patterns.behavioral.strategy;

public class SignDocument implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Signing document ...");
    }
}

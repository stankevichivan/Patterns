package stankevich.patterns.behavioral.stage;

public class SignDocument implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Signing document ...");
    }
}

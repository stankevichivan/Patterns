package stankevich.patterns.behavioral.strategy.old;

public class ValidateDocument implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Validating ...");
    }
}

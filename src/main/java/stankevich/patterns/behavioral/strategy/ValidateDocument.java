package stankevich.patterns.behavioral.strategy;

public class ValidateDocument implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Validating ...");
    }
}

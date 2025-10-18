package stankevich.patterns.behavioral.stage.old;

public class ValidateDocument implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Validating ...");
    }
}

package stankevich.patterns.behavioral.stage;

public class ValidateDocument implements DocumentOperation{
    @Override
    public void doOperation() {
        System.out.println("Validating ...");
    }
}

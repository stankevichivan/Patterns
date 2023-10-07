package stankevich.patterns.behavioral.strategy;

public class ReplaceParams implements DocumentOperation {
    @Override
    public void doOperation() {
        System.out.println("Replacing params ...");
    }
}

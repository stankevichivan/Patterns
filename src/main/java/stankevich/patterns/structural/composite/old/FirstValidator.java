package stankevich.patterns.structural.composite.old;

public class FirstValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("first validation");
    }
}

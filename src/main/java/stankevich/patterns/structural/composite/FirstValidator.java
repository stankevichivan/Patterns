package stankevich.patterns.structural.composite;

public class FirstValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("first validation");
    }
}

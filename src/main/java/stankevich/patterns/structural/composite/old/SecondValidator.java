package stankevich.patterns.structural.composite.old;

public class SecondValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("second validation");
    }
}

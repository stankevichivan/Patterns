package stankevich.patterns.behavioral.chain;

public class Stage3Validator extends Validator{
    @Override
    public boolean validate() {
        System.out.println("validating stage 3");
        return true;
    }
}

package stankevich.patterns.behavioral.chain;

public class Stage1Validator extends Validator{
    @Override
    public boolean validate() {
        System.out.println("validating stage 1");
        return true;
    }
}

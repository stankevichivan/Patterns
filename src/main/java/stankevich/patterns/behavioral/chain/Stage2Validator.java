package stankevich.patterns.behavioral.chain;

public class Stage2Validator extends Validator{
    @Override
    public boolean validate() {
        System.out.println("validating stage 2");
        return true;
    }
}

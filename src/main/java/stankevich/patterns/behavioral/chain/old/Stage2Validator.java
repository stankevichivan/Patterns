package stankevich.patterns.behavioral.chain.old;

public class Stage2Validator extends Validator{
    @Override
    public boolean validate() {
        System.out.println("validating stage 2");
        return false;
    }
}

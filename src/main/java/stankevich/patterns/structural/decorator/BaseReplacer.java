package stankevich.patterns.structural.decorator;

public class BaseReplacer implements Replacer{
    @Override
    public String replace() {
        return "base replace";
    }
}

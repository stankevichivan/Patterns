package stankevich.patterns.structural.decorator.old;

public class ReplacerDecorator implements Replacer{

    Replacer replacer;

    public ReplacerDecorator(Replacer replacer) {
        this.replacer = replacer;
    }

    @Override
    public String replace() {
        return replacer.replace();
    }
}

package stankevich.patterns.structural.decorator.old;

public class BonusReplacer extends ReplacerDecorator{
    public BonusReplacer(Replacer replacer) {
        super(replacer);
    }

    private String bonusReplace() {
        return " bonus replace";
    }

    @Override
    public String replace() {
        return super.replace() + bonusReplace();
    }
}

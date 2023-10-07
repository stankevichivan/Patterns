package stankevich.patterns.structural.decorator;

public class ImportReplacer extends ReplacerDecorator {

    public ImportReplacer(Replacer replacer) {
        super(replacer);
    }

    private String importReplace() {
        return " import replace";
    }

    @Override
    public String replace() {
        return super.replace() + importReplace();
    }
}

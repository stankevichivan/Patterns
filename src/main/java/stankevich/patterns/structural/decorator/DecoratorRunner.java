package stankevich.patterns.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {

        Replacer replacer = new BaseReplacer();
        Replacer replacer1 = new ImportReplacer(new BaseReplacer());
        Replacer replacer2 = new BonusReplacer(new ImportReplacer(new BaseReplacer()));

        System.out.println(replacer.replace());
        System.out.println(replacer1.replace());
        System.out.println(replacer2.replace());
    }
}

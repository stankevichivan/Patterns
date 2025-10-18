package stankevich.patterns.structural.decorator.old;

import stankevich.patterns.structural.decorator.old.BaseReplacer;
import stankevich.patterns.structural.decorator.old.BonusReplacer;
import stankevich.patterns.structural.decorator.old.ImportReplacer;
import stankevich.patterns.structural.decorator.old.Replacer;

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

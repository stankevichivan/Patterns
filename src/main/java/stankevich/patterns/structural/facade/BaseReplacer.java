package stankevich.patterns.structural.facade;

public class BaseReplacer implements Replacer {
    public String type = "MainReplacer";

    @Override
    public void replace() {
        System.out.println("replacer " + type);
    }
}

package stankevich.patterns.structural.facade;

public class ReplacerFactory {
    public static Replacer getReplacer(Document document) {
        return switch (document.getType()) {
            case 191 -> new Replacer191();
            default -> null;
        };
    }
}

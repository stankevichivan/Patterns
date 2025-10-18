package stankevich.patterns.generating.abstractfactory;

public interface DocumentFactory {
    Document createDocument();

    Validator createValidator();

    Replacer createReplacer();
}

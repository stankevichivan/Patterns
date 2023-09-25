package stankevich.patterns.generating.abstractfactory;

public interface DocumentFactory {
    Document getDocument();

    Validator getValidator();

    Replacer getReplacer();
}

package stankevich.patterns.abstractfactory;

public interface DocumentFactory {
    Document getDocument();

    Validator getValidator();

    Replacer getReplacer();
}

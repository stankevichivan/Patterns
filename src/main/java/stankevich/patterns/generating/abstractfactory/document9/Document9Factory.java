package stankevich.patterns.generating.abstractfactory.document9;

import stankevich.patterns.generating.abstractfactory.Document;
import stankevich.patterns.generating.abstractfactory.DocumentFactory;
import stankevich.patterns.generating.abstractfactory.Replacer;
import stankevich.patterns.generating.abstractfactory.Validator;

public class Document9Factory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Document9();
    }

    @Override
    public Validator createValidator() {
        return new Validator9();
    }

    @Override
    public Replacer createReplacer() {
        return new Replacer9();
    }
}

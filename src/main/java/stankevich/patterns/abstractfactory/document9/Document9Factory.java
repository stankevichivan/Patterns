package stankevich.patterns.abstractfactory.document9;

import stankevich.patterns.abstractfactory.Document;
import stankevich.patterns.abstractfactory.DocumentFactory;
import stankevich.patterns.abstractfactory.Replacer;
import stankevich.patterns.abstractfactory.Validator;

public class Document9Factory implements DocumentFactory {
    @Override
    public Document getDocument() {
        return new Document9();
    }

    @Override
    public Validator getValidator() {
        return new Validator9();
    }

    @Override
    public Replacer getReplacer() {
        return new Replacer9();
    }
}

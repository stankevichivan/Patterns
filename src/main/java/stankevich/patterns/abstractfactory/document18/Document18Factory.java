package stankevich.patterns.abstractfactory.document18;

import stankevich.patterns.abstractfactory.Document;
import stankevich.patterns.abstractfactory.DocumentFactory;
import stankevich.patterns.abstractfactory.Replacer;
import stankevich.patterns.abstractfactory.Validator;

public class Document18Factory implements DocumentFactory {
    @Override
    public Document getDocument() {
        return new Document18();
    }

    @Override
    public Validator getValidator() {
        return new Validator18();
    }

    @Override
    public Replacer getReplacer() {
        return new Replacer18();
    }
}

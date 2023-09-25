package stankevich.patterns.generating.abstractfactory.document18;

import stankevich.patterns.generating.abstractfactory.Document;
import stankevich.patterns.generating.abstractfactory.DocumentFactory;
import stankevich.patterns.generating.abstractfactory.Replacer;
import stankevich.patterns.generating.abstractfactory.Validator;

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

package stankevich.patterns.generating.abstractfactory.document18;

import stankevich.patterns.generating.abstractfactory.Document;
import stankevich.patterns.generating.abstractfactory.DocumentFactory;
import stankevich.patterns.generating.abstractfactory.Replacer;
import stankevich.patterns.generating.abstractfactory.Validator;

public class Document18Factory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Document18();
    }

    @Override
    public Validator createValidator() {
        return new Validator18();
    }

    @Override
    public Replacer createReplacer() {
        return new Replacer18();
    }
}

package stankevich.patterns.abstractfactory.document18;

import stankevich.patterns.abstractfactory.Document;

public class Document18 implements Document {
    @Override
    public void create() {
        System.out.println("document 18 creating");
    }
}

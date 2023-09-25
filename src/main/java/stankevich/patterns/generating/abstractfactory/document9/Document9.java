package stankevich.patterns.generating.abstractfactory.document9;

import stankevich.patterns.generating.abstractfactory.Document;

public class Document9 implements Document {
    @Override
    public void create() {
        System.out.println("Document 9 creating");
    }
}

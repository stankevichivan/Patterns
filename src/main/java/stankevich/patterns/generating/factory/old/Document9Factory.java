package stankevich.patterns.generating.factory.old;

public class Document9Factory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new Document9();
    }
}

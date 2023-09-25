package stankevich.patterns.generating.factory;

public class Document9Factory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new Document9();
    }
}

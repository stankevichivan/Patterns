package stankevich.patterns.generating.factory;

public class Document18Factory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new Document18();
    }
}

package stankevich.patterns.generating.factory.old;

public class Document18Factory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new Document18();
    }
}

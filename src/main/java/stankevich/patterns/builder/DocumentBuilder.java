package stankevich.patterns.builder;

public abstract class DocumentBuilder {
    Document document;

    void createDocument() {
        document = new Document();
    }

    abstract void buildNumber();

    abstract void buildPrintForm();

    abstract void buildType();

    Document getDocument() {
        return document;
    }
}

package stankevich.patterns.generating.builder;

public class Director {
    DocumentBuilder documentBuilder;

    public void setDocumentBuilder(DocumentBuilder documentBuilder) {
        this.documentBuilder = documentBuilder;
    }

    Document buildDocument() {
        documentBuilder.createDocument();

        documentBuilder.buildNumber();
        documentBuilder.buildPrintForm();
        documentBuilder.buildType();

        return documentBuilder.getDocument();
    }
}

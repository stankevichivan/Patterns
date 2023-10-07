package stankevich.patterns.structural.bridge;

public abstract class Document {
    protected DocumentValidator validator;

    protected Document(DocumentValidator validator) {
        this.validator = validator;
    }

    public abstract void createDocument();
}

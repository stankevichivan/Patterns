package stankevich.patterns.structural.bridge;

public class Document16 extends Document{

    protected Document16(DocumentValidator validator) {
        super(validator);
    }

    @Override
    public void createDocument() {
        System.out.println("creating 16 document");
        validator.validate();
    }
}

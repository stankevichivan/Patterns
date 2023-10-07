package stankevich.patterns.structural.bridge;

public class Document9 extends Document{

    protected Document9(DocumentValidator validator) {
        super(validator);
    }

    @Override
    public void createDocument() {
        System.out.println("creating document 9");
        validator.validate();
    }
}

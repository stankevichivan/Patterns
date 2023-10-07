package stankevich.patterns.behavioral.strategy;

public class Document {
    DocumentOperation operation;

    public void setOperation(DocumentOperation operation) {
        this.operation = operation;
    }

    public void doOperation() {
        operation.doOperation();
    }
}

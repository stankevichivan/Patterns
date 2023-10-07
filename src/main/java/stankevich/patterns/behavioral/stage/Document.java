package stankevich.patterns.behavioral.stage;

public class Document {
    DocumentOperation operation;

    public void setOperation(DocumentOperation operation) {
        this.operation = operation;
    }

    public void changeOperation() {
        if (operation instanceof ValidateDocument) {
            setOperation(new ReplaceParams());
        } else if (operation instanceof ReplaceParams) {
            setOperation(new SignDocument());
        } else if (operation instanceof SignDocument) {
            setOperation(new ValidateDocument());
        }
    }

    public void doOperation() {
        operation.doOperation();
    }
}

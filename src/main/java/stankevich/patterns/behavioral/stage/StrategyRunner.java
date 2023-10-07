package stankevich.patterns.behavioral.stage;

public class StrategyRunner {
    public static void main(String[] args) {
        DocumentOperation operation = new ValidateDocument();
        Document document = new Document();

        document.setOperation(operation);
        document.doOperation();
        document.changeOperation();
        document.doOperation();
        document.changeOperation();
        document.doOperation();
    }
}

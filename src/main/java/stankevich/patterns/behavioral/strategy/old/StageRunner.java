package stankevich.patterns.behavioral.strategy.old;

public class StageRunner {
    public static void main(String[] args) {
        Document document = new Document();
        document.setOperation(new ValidateDocument());
        document.doOperation();

        document.setOperation(new ReplaceParams());
        document.doOperation();

        document.setOperation(new SignDocument());
        document.doOperation();
    }
}

package stankevich.patterns.structural.composite.old;

public class CompositeRunner {
    public static void main(String[] args) {
        Document document = new Document();
        document.addValidator(new FirstValidator());
        document.addValidator(new SecondValidator());

        document.validateDocument();
    }
}

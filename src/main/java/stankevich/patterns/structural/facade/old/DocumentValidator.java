package stankevich.patterns.structural.facade.old;

public class DocumentValidator {

    public static boolean validate(Document document) {
        System.out.println("validating " + document.getType());
        return true;
    }
}

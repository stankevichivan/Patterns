package stankevich.patterns.abstractfactory;

import stankevich.patterns.abstractfactory.document18.Document18Factory;
import stankevich.patterns.abstractfactory.document9.Document9Factory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        DocumentFactory documentFactory = createDocumentByFactory(18);
        Document document = documentFactory.getDocument();
        Validator validator = documentFactory.getValidator();
        Replacer replacer = documentFactory.getReplacer();

        document.create();
        validator.validate();
        replacer.replace();
    }

    private static DocumentFactory createDocumentByFactory(int documentNumber){
        return switch (documentNumber){
            case 9 -> new Document9Factory();
            case 18 -> new Document18Factory();
            default -> throw new AssertionError(documentNumber + " document does not exist");
        };
    }
}

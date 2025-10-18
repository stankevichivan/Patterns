package stankevich.patterns.generating.factory.old;

public class FactoryRunner {
    public static void main(String[] args) {
        DocumentFactory factory = createDocumentByFactory(19);
        var document = factory.createDocument();
        document.create();
    }

    private static DocumentFactory createDocumentByFactory(int documentNumber){
        return switch (documentNumber){
            case 9 -> new Document9Factory();
            case 18 -> new Document18Factory();
            default -> throw new AssertionError(documentNumber + " document does not exist");
        };
    }
}

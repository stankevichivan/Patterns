package stankevich.patterns.structural.facade.old;

public class DocumentCreationFacade {
    public Document createDocument(int type) {
        System.out.println("facade operations");
        Document document = new Document191();
        var replacer = ReplacerFactory.getReplacer(document);
        replacer.replace();
        DocumentValidator.validate(document);
        System.out.println("facade operations finished");
        return document;
    }
}

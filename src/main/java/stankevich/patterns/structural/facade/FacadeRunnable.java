package stankevich.patterns.structural.facade;

public class FacadeRunnable {
    public static void main(String[] args) {
        DocumentCreationFacade facade = new DocumentCreationFacade();
        var document = facade.createDocument(191);
        System.out.println(document);
    }
}

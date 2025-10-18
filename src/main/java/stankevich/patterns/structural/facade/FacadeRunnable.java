package stankevich.patterns.structural.facade;

import stankevich.patterns.structural.facade.old.DocumentCreationFacade;

public class FacadeRunnable {
    public static void main(String[] args) {
        DocumentCreationFacade facade = new DocumentCreationFacade();
        var document = facade.createDocument(191);
        System.out.println(document);
    }
}

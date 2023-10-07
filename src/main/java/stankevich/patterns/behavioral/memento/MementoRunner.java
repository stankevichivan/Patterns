package stankevich.patterns.behavioral.memento;

public class MementoRunner {
    public static void main(String[] args) {
        Document document = new Document();
        DocumentVersionRepository repository = new DocumentVersionRepository();
        document.setVersionAndDate(1.0f);
        System.out.println(document);
        repository.setSave(document.save());
        document.setVersionAndDate(1.1f);
        System.out.println(document);
        System.out.println("rollback");
        document.load(repository.getSave());
        System.out.println(document);

    }
}

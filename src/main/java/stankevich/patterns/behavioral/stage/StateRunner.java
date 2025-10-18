package stankevich.patterns.behavioral.stage;

public class StateRunner {
    public static void main(String[] args) {
        Document document = new Document();

        System.out.println("--- Действия с черновиком ---");
        document.approve();
        document.publish();

        System.out.println("\n--- Действия с документом на модерации ---");
        document.publish();
        document.approve();

        System.out.println("\n--- Действия с опубликованным документом ---");
        document.approve();
        document.publish();
    }
}

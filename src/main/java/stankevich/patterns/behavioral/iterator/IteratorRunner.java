package stankevich.patterns.behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        Document document = new Document(9, new String[]{"number, clientId, acc, text"});
        var iterator = document.getIterator();
        System.out.println("Document number: " + document.getType());
        System.out.print("Params: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

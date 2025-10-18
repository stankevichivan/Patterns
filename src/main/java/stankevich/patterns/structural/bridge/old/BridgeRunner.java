package stankevich.patterns.structural.bridge.old;

public class BridgeRunner {
    public static void main(String[] args) {
        Document[] documents = {
                new Document9(new Document9Validator()),
                new Document16(new Document16Validator())
        };
        for (Document document : documents) {
            document.createDocument();
        }
    }
}

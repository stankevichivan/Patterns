package stankevich.patterns.generating.builder;

public class BuilderRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setDocumentBuilder(new Document9Builder());
        Document document = director.buildDocument();
        System.out.println(document);
    }
}

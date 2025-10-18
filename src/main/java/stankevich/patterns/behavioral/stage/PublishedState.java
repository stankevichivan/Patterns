package stankevich.patterns.behavioral.stage;

public class PublishedState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Документ уже опубликован.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Документ уже утвержден.");
    }
}

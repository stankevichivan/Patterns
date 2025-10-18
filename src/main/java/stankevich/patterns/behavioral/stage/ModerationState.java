package stankevich.patterns.behavioral.stage;

public class ModerationState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Документ уже на модерации, нельзя отправить повторно.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Документ утвержден и опубликован!");
        document.changeState(new PublishedState());
    }
}

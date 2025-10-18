package stankevich.patterns.behavioral.stage;

public class DraftState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Документ отправлен на модерацию.");
        document.changeState(new ModerationState());
    }

    @Override
    public void approve(Document document) {
        System.out.println("Нельзя утвердить черновик.");
    }
}

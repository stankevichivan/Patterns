package stankevich.patterns.behavioral.stage;

public class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftState();
    }

    public void changeState(DocumentState state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

    public void approve() {
        state.approve(this);
    }
}

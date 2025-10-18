package stankevich.patterns.behavioral.stage;

public interface DocumentState {
    void publish(Document document);
    void approve(Document document);
}

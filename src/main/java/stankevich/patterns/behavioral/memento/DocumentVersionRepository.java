package stankevich.patterns.behavioral.memento;

public class DocumentVersionRepository {
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}

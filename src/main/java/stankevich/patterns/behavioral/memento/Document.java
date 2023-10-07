package stankevich.patterns.behavioral.memento;

import java.time.LocalDateTime;

public class Document {
    private float version;
    private LocalDateTime time;

    public void setVersionAndDate(float version) {
        this.version = version;
        time = LocalDateTime.now();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        time = save.getTime();
    }

    @Override
    public String toString() {
        return "Document{" +
                "version=" + version +
                ", time=" + time +
                '}';
    }
}

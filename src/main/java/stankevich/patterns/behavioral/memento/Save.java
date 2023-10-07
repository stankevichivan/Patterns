package stankevich.patterns.behavioral.memento;

import java.time.LocalDateTime;

public class Save {
    private float version;
    private LocalDateTime time;

    public Save(float version) {
        this.version = version;
        time = LocalDateTime.now();
    }

    public float getVersion() {
        return version;
    }

    public LocalDateTime getTime() {
        return time;
    }
}

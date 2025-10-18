package stankevich.patterns.behavioral.observer.old;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> products);
}

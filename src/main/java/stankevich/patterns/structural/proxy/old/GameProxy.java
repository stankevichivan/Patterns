package stankevich.patterns.structural.proxy.old;

import java.util.HashMap;
import java.util.Map;

public class GameProxy implements Game {

    private final String name;
    private static final Map<String, Game> cachedGames = new HashMap<>();

    public GameProxy(String name) {
        this.name = name;
        System.out.println("creating proxy");
    }

    @Override
    public void play() {
        System.out.println("searching gameLauncher from cache");
        var game = cachedGames.computeIfAbsent(name, GameClient::new);
        game.play();
    }
}

package stankevich.patterns.structural.proxy;

public class GameClient implements Game {

    private String name;

    public GameClient(String name) {
        this.name = name;
        System.out.println("creating game client");
        loadResources();
    }

    public void loadResources() {
        System.out.println("loading resources for " + name);
    }

    @Override
    public void play() {
        System.out.println("playing in farcry");
    }
}

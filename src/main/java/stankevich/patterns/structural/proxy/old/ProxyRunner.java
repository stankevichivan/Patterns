package stankevich.patterns.structural.proxy.old;

import stankevich.patterns.structural.proxy.old.Game;
import stankevich.patterns.structural.proxy.old.GameProxy;

public class ProxyRunner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new GameProxy("farcry");

        System.out.println("lazy initialization");
        Thread.sleep(5000L);
        game.play();
    }
}

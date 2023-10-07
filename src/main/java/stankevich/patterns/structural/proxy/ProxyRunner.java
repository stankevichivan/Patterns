package stankevich.patterns.structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new GameProxy("farcry");

        System.out.println("lazy initialization");
        Thread.sleep(5000L);
        game.play();
    }
}

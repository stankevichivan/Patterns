package stankevich.patterns.behavioral.template;

public class Gamer extends GamerTemplate {
    private final String name;

    public Gamer(String name) {
        this.name = name;
    }

    @Override
    void showGreeting() {
        System.out.println("hello " + name);
    }
}

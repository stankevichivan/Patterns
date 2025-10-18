package stankevich.patterns.behavioral.template.old;

public class Gamer2 extends GamerTemplate {
    private final String name;

    public Gamer2(String name) {
        this.name = name;
    }

    @Override
    void showGreeting() {
        System.out.println("hello " + name);
    }
}

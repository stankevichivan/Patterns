package stankevich.patterns.behavioral.template.old;

public abstract class GamerTemplate {
    void startGame() {
        System.out.println("loading ...");
        showGreeting();
        System.out.println("main menu ...");
    }

    abstract void showGreeting();
}

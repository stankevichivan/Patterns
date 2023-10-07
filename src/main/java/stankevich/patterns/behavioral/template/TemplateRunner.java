package stankevich.patterns.behavioral.template;

public class TemplateRunner {
    public static void main(String[] args) {
        GamerTemplate ivan = new Gamer("ivam");
        GamerTemplate yana = new Gamer("yana");

        ivan.startGame();
        yana.startGame();
    }
}

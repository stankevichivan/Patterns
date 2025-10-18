package stankevich.patterns.generating.singleton;

public enum Logger {
    INSTANCE;

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

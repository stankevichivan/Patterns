package stankevich.patterns.structural.composite;

public class Dot implements Graphic {
    private final int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем точку в координатах (" + x + ", " + y + ")");
    }
}

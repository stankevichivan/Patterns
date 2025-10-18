package stankevich.patterns.generating.prototype;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        System.out.println("Создание круга с радиусом " + radius);
    }

    @Override
    public Shape clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с радиусом ." + radius);
    }
}

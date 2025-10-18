package stankevich.patterns.generating.prototype;

public class PRunner {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(10);
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.draw();
        System.out.println(originalCircle + " " + clonedCircle);
    }
}

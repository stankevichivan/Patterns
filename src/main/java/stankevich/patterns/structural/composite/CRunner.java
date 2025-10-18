package stankevich.patterns.structural.composite;

public class CRunner {
    public static void main(String[] args) {

        Graphic dot1 = new Dot(10, 20);
        Graphic circle1 = new Circle(30, 40, 5);

        CompoundGraphic group1 = new CompoundGraphic();
        group1.add(dot1);
        group1.add(circle1);

        group1.draw();

        System.out.println("\n----------------------------\n");

        CompoundGraphic allGraphics = new CompoundGraphic();
        allGraphics.add(new Dot(0, 0));
        allGraphics.add(group1);

        allGraphics.draw();
    }
}

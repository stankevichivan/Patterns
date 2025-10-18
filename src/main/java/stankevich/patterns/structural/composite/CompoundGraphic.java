package stankevich.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private final List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void draw() {
        System.out.println("--- Рисуем составную графику ---");
        for (Graphic child : children) {
            child.draw();
        }
        System.out.println("--- Конец составной графики ---");
    }
}

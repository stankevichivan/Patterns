package stankevich.patterns.generating.prototype;

public interface Shape extends Cloneable {

    Shape clone();
    void draw();
}

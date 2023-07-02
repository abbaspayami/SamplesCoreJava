package Java17.SealedClass;

public sealed interface Shape permits Circle, Rectangle {
    void draw();
}

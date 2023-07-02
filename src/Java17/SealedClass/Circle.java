package Java17.SealedClass;

public non-sealed class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

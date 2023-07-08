package DesignPattern.FacadePattern;

public class Facade {
    private ClassA classA;
    private ClassB classB;
    private ClassC classC;

    public Facade() {
        classA = new ClassA();
        classB = new ClassB();
        classC = new ClassC();}

    public void operation() {
        classA.operationA();
        classB.operationB();
        classC.operationC();
    }

}

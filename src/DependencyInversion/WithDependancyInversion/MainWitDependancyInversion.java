package DependencyInversion.WithDependancyInversion;

public class MainWitDependancyInversion {
    public static void main(String[] args) {
        ClassA withDI = new ClassA();
        MyInterface myInterface = new ClassB();
//        MyInterface myInterface1 = new ClassC();
//        withDI.myInterface = myInterface1;
    }
}

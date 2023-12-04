package IsA_HasA.Has_A;

public class CompositionExample {
    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Car myCar = new Car(carEngine);

        myCar.start();
        myCar.drive();
    }
}

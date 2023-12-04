package IsA_HasA.Has_A;

public class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    // Additional car-specific functionality
    public void drive() {
        System.out.println("Car is driving");
    }
}

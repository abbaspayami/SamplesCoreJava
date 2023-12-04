package IsA_HasA.Has_A;

public class Vehicle {

    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

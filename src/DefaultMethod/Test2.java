package DefaultMethod;

public interface Test2 extends Test1{

    default void doSomething(){
        System.out.println("Test2");
    }
}

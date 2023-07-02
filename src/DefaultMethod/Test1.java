package DefaultMethod;

public interface Test1{

    default void doSomething(){
        System.out.println("Test1");
    }

}

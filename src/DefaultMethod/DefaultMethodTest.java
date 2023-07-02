package DefaultMethod;

import java.util.ArrayList;

public class DefaultMethodTest implements Test1, Test2 {

    public static void main(String[] args) {
        DefaultMethodTest s = new DefaultMethodTest();
        s.doSomething();
        ((Test1)s).doSomething();
        ((Test2)s).doSomething();
//        s.doSomething();
//        s.doSomeThing();

        var array = new ArrayList<String>();
        array.add("Hello");
    }
}

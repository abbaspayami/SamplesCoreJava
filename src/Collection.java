import java.util.HashMap;
import java.util.Map;

public class Collection {

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());

        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName()  + " " + e.toString() + " " + e.getCause());
            }
        });
        t.start();
    }

}

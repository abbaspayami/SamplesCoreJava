package multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFutureExample {

    public static void main(String[] args) {
        // Create a Callable task
        Callable<Integer> callableTask = () -> {
            // Simulate some time-consuming task
            Thread.sleep(2000);
            return 42;
        };

        // Create a FutureTask with the Callable
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);

        // Create a Thread to execute the FutureTask
        Thread thread = new Thread(futureTask);

        // Start the thread
        thread.start();

        try {
            // Wait for the task to complete and get the result
            Integer result = futureTask.get();

            System.out.println("Result of the task: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}

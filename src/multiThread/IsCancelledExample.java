package multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class IsCancelledExample {

    public static void main(String[] args) {
        // Create a Callable task
        Callable<Integer> callableTask = () -> {
            // Simulate some time-consuming task
            try {
                System.out.println("before sleep..");
                Thread.sleep(2000);
                System.out.println("after sleep...");
                return 42;
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted.");
            }
            return 12;
        };

        // Create a FutureTask with the Callable
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);

        // Create a Thread to execute the FutureTask
        Thread thread = new Thread(futureTask);

        // Start the thread
        thread.start();

        // Cancel the task after a certain period (e.g., 1 second)
        try {
            // Sleep for 1 second
            Thread.sleep(1000);

            // Cancel the task
            boolean cancelled = futureTask.cancel(true);

            if (cancelled) {
                System.out.println("Task cancelled");
            } else {
                System.out.println("Task could not be cancelled");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the task is cancelled
        boolean isCancelled = futureTask.isCancelled();

        if (isCancelled) {
            System.out.println("Task is cancelled");
        } else {
            try {
                // Wait for the task to complete and get the result
                Integer result = futureTask.get();
                System.out.println("Result of the task: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}

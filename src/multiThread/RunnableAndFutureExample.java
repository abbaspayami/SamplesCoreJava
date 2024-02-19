package multiThread;

import java.util.concurrent.*;

public class RunnableAndFutureExample {


    public static void main(String[] args) {
        // Create a Runnable task
        Runnable runnableTask = () -> {
            try {
                // Simulate some time-consuming task
                Thread.sleep(2000);
                System.out.println("Runnable task completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Create a FutureTask with the Runnable
        FutureTask<Void> futureTask = new FutureTask<>(runnableTask, null);

        // Create an ExecutorService to submit the FutureTask
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit the FutureTask
        executorService.submit(futureTask);

        try {
            // Wait for the task to complete with a timeout of 3 seconds
            futureTask.get(3, TimeUnit.SECONDS);
            System.out.println("Task completed within the timeout");
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            // Handle exceptions
            e.printStackTrace();
        } finally {
            // Shut down the ExecutorService
            executorService.shutdown();
        }
    }

}

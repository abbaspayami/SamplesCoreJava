package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkExample {

    public static void main(String[] args) throws InterruptedException {
        // Create an ExecutorService with a fixed-size thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks for execution
        executor.submit(new Task("Task 1"));
        executor.submit(new Task("Task 2"));
        executor.submit(new Task("Task 3"));

        // Shutdown the executor after tasks are submitted
        executor.shutdown();
    }

    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Executing " + name + " in thread " + Thread.currentThread().getName());
            // Perform some task logic here
        }
    }
}

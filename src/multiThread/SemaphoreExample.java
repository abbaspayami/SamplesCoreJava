package multiThread;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        // Create a Semaphore with a permit count of 3
        Semaphore semaphore = new Semaphore(3);

        // Create five worker threads
        WorkerThread2 worker1 = new WorkerThread2("Worker 1", semaphore);
        WorkerThread2 worker2 = new WorkerThread2("Worker 2", semaphore);
        WorkerThread2 worker3 = new WorkerThread2("Worker 3", semaphore);
        WorkerThread2 worker4 = new WorkerThread2("Worker 4", semaphore);
        WorkerThread2 worker5 = new WorkerThread2("Worker 5", semaphore);

        // Start the worker threads
        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();
    }
}

class WorkerThread2 extends Thread {
    private final Semaphore semaphore;

    public WorkerThread2(String name, Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            // Acquire a permit from the semaphore
            semaphore.acquire();

            System.out.println(getName() + " is accessing the shared resource.");

            // Simulate some work being done by the worker thread
            Thread.sleep(2000);

            System.out.println(getName() + " has finished its work and is releasing the resource.");

            // Release the permit back to the semaphore
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


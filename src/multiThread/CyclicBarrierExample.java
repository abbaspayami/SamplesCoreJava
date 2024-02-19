package multiThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        // Create a CyclicBarrier for 3 parties (threads)
        CyclicBarrier barrier = new CyclicBarrier(3);

        // Create three worker threads
        WorkerThread1 worker1 = new WorkerThread1("Worker 1", barrier);
        WorkerThread1 worker2 = new WorkerThread1("Worker 2", barrier);
        WorkerThread1 worker3 = new WorkerThread1("Worker 3", barrier);

        // Start the worker threads
        worker1.start();
        worker2.start();
        worker3.start();
    }
}

class WorkerThread1 extends Thread {
    private final CyclicBarrier barrier;

    public WorkerThread1(String name, CyclicBarrier barrier) {
        super(name);
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " is waiting at the barrier.");
            barrier.await(); // Wait for other threads to reach the barrier

            System.out.println(getName() + " has passed the barrier and is continuing.");

            // Simulate some work being done by the worker thread
            Thread.sleep(2000);

            System.out.println(getName() + " has finished its work.");

            // Wait at the barrier again
            barrier.await();
            System.out.println(getName() + " is done.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}


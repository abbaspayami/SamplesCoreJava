package multiThread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        // Create a CountDownLatch with a count of 3
        CountDownLatch latch = new CountDownLatch(3);

        // Create three worker threads
        WorkerThread worker1 = new WorkerThread("Worker 1", latch);
        WorkerThread worker2 = new WorkerThread("Worker 2", latch);
        WorkerThread worker3 = new WorkerThread("Worker 3", latch);

        worker1.interrupt();
        // Start the worker threads
        worker1.start();
        worker2.start();
        worker3.start();

        try {
            // Main thread waits until the count reaches zero
            latch.await();
            System.out.println("All workers have finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WorkerThread extends Thread {
    private final CountDownLatch latch;

    public WorkerThread(String name, CountDownLatch latch) {
        super(name);
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Simulate some work being done by the worker thread
            Thread.sleep(2000);
            System.out.println(getName() + " has finished its work.");

            // Decrement the latch count
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

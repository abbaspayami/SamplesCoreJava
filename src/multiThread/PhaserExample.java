package multiThread;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        // Create a Phaser with an initial party count of 3
        Phaser phaser = new Phaser(3);

        // Create three worker threads
        WorkerThread3 worker1 = new WorkerThread3("Worker 1", phaser);
        WorkerThread3 worker2 = new WorkerThread3("Worker 2", phaser);
        WorkerThread3 worker3 = new WorkerThread3("Worker 3", phaser);

        // Start the worker threads
        worker1.start();
        worker2.start();
        worker3.start();

        // Await the termination of all threads
        phaser.awaitAdvance(0); // Wait for all threads to reach the barrier
        System.out.println("All workers have finished.");
    }
}

class WorkerThread3 extends Thread {
    private final Phaser phaser;

    public WorkerThread3(String name, Phaser phaser) {
        super(name);
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(getName() + " is starting its work.");

        // Perform some work
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " has finished its work and is waiting at the barrier.");

        // Arrive at the barrier
        phaser.arriveAndAwaitAdvance();

        System.out.println(getName() + " is done.");
    }
}


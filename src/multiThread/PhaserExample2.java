package multiThread;

import java.util.concurrent.Phaser;

public class PhaserExample2 {

    public static void main(String[] args) {
        int numWorkers = 3;
        int numPhases = 3;

        Phaser phaser = new Phaser(numWorkers+1); // worker thread + main thread

        for (int i = 0; i < numWorkers; i++) {
            new WorkerThread4("Worker " + (i + 1), phaser, numPhases).start();
        }

        // Main thread coordinates multiple phases
        for (int phase = 0; phase < numPhases; phase++) {
            System.out.println("Phase " + (phase + 1) + " started.");

            // Work in this phase

            // Signal that this phase is complete
            phaser.arriveAndAwaitAdvance();

            System.out.println("Phase " + (phase + 1) + " completed.\n");
        }

        System.out.println("All phases are done.");
    }
}

class WorkerThread4 extends Thread {
    private final Phaser phaser;
    private final int numPhases;

    public WorkerThread4(String name, Phaser phaser, int numPhases) {
        super(name);
        this.phaser = phaser;
        this.numPhases = numPhases;
    }

    @Override
    public void run() {
        for (int phase = 0; phase < numPhases; phase++) {
            System.out.println(getName() + " is starting Phase " + (phase + 1) + ".");

            // Simulate some work for this phase
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " has completed Phase " + (phase + 1) + ".");

            // Signal that this phase is complete
            phaser.arriveAndAwaitAdvance();
        }
    }


}

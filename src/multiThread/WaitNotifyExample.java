package multiThread;

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create two threads - one producer and one consumer
        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedResource.produce(i);
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedResource.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

class SharedResource {
    private int data;
    private boolean produced = false;

    // Producer method
    public synchronized void produce(int value) {
        // Wait until consumer consumes the previous value
        while (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Produce the value
        data = value;
        System.out.println("Produced: " + data);
        produced = true;

        // Notify the waiting consumer
        notify();
    }

    // Consumer method
    public synchronized void consume() {
        // Wait until producer produces a value
        while (!produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Consume the value
        System.out.println("Consumed: " + data);
        produced = false;

        // Notify the waiting producer
        notify();
    }
}

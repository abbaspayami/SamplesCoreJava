package multiThread;

public class WaitNotifyAllExample {
    public static void main(String[] args) {
        Message message = new Message();

        // Create multiple producer threads
        Thread producerThread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                message.produce("T1" , "T1: Message #" + i);
            }
        });

        Thread producerThread2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                message.produce("T2" , "T2: Message #" + i);
            }
        });

        // Create a consumer thread
        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                message.consume();
            }
        });

        producerThread1.start();
        producerThread2.start();
        consumerThread.start();
    }
}

class Message {
    private String content;
    private boolean produced = false;

    // Producer method
    public synchronized void produce(String name, String message) {
        // Wait until the consumer consumes the previous message
        while (produced) {
            try {
                System.out.println("Waiting : " + name);
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Produce the message
        content = message;
        System.out.println("Produced: " + content);
        produced = true;

        // Notify all waiting consumers
        notify();
    }

    // Consumer method
    public synchronized void consume() {
        // Wait until the producer produces a message
        while (!produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Consume the message
        System.out.println("Consumed: " + content);
        produced = false;

        // Notify all waiting producers
        notifyAll();
    }
}


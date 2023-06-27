package Thread.InterCommunication;

public class Message {
    private String content;
    private boolean isMessageAvailable = false;

    public synchronized void produce(String message) {
        while (isMessageAvailable) {
            try {
                // Wait until the consumer consumes the previous message
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        content = message;
        isMessageAvailable = true;
        System.out.println("Produced: " + message);

        // Notify the waiting consumer thread
        notify();
    }

    public synchronized String consume() {
        while (!isMessageAvailable) {
            try {
                // Wait until a message is produced
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }

        String message = content;
        isMessageAvailable = false;
        System.out.println("Consumed: " + message);

        // Notify the waiting producer thread
        notify();

        return message;
    }

}

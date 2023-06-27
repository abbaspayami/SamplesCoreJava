package Thread.InterCommunication;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            String[] messages = {"Message 1", "Message 2", "Message 3"};
            for (String msg : messages) {
                message.produce(msg);
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                String msg = message.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

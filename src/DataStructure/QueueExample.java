package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Abbas");
        queue.add("Riaz");
        queue.add("Carla");
        System.out.println(queue);

        String peek = queue.element();
        System.out.println(peek);
        System.out.println(queue);

    }
}

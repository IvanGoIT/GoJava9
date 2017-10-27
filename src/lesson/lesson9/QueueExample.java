package lesson.lesson9;

import question.question5.utils.Dog;
import sun.misc.Queue;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("123");  // 2
        queue.add("000");  // 1
        queue.add("2000"); // 3

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        queue.add("5555");
        queue.add("5000");

        System.out.println(queue.poll());

        queue.add("99999");
        queue.add("00000");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

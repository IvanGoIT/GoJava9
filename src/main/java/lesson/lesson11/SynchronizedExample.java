package lesson.lesson11;

import java.util.ArrayList;
import java.util.Random;

public class SynchronizedExample {
    private static final Random random = new Random();
    private static final ArrayList<Integer> array = new ArrayList<>();


    public static void main(String[] args) {

        Runnable taskInput = () -> {
            for(int i = 0; i < 1000; i++) {
                array.add(i);
            }
        };

        Runnable taskRemove = () -> {
            while(true) {
                synchronized (array) {
                    if (!array.isEmpty()) {
                        int index = random.nextInt(array.size());
                        array.remove(index);
                    } else {
                        break;
                    }
                }
            }
        };

        Runnable taskRead = () -> {
            int index = 0;
            while(true) {
                synchronized (array) {
                    if (!array.isEmpty()) {
                        System.out.println(array.get(index++));
                    } else {
                        break;
                    }
                }
            }
        };

        new Thread(taskRemove).start();
        new Thread(taskRead).start();
        new Thread(taskInput).start();
    }
}

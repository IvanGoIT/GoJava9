package lesson.lesson11;

import java.util.stream.Stream;

public class ThreadExample {

    static int counter = 0;
    static int[] values = new int[4];

    static void execute(int size) {
        int sum = 0;

        String name = Thread.currentThread().getName();
        System.out.println("Thread.name     = " + name);
        System.out.println("Thread.priority = " + Thread.currentThread().getPriority());

        for(int i = 0; i < size; i++) {
            System.out.println(name + "   " + i);
            sum += i;
        }

        System.out.println(name + " засыпает");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " проснулся");

        System.out.println(name + " local sum = " + sum);
        values[counter++] = sum;
    }

    public static void main(String[] args) {

        Thread[] threads = new Thread[4];

        // Вариант 1 ---------------------------------
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // thread code
                execute(3);
            }
        };
        threads[0] = new Thread(task);

        // Вариант 2 ---------------------------------
        threads[1] = new Thread(new Runnable() {
            @Override
            public void run() {
                execute(10);
            }
        });

        // Вариант 3 ---------------------------------
        Runnable task2 = () -> {execute(5);};
        threads[2] = new Thread(task2);

        // Вариант 4 ---------------------------------
        threads[3] = new Thread(() -> {execute(7);});

        for(int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        try {
            for(int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("Total sum = " + sum);

        System.out.println("Программа завершилась");
    }
}

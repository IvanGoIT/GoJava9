package lesson.lesson12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolExample {

    public static Runnable saySomething(String saySomething, int count) {
        return saySomething(saySomething, count, null);
    }

    public static Runnable saySomething(String saySomething, int count, Runnable onFinished) {
        return () -> {
            for(int i = 0; i < count; i++) {
                System.out.println(Thread.currentThread().getName()
                        + "[" + i + "]  says: " + saySomething);
            }

            if (onFinished != null) onFinished.run();
        };
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(saySomething("Hello", 10, () -> {
            System.out.println("Это мое первое событие печатает текст в консоль");
        }));
        pool.submit(saySomething("Hi", 13));
        pool.submit(saySomething(":)", 5, () -> {
            System.out.println("            _____________________               ");
            System.out.println("            __________00_________               ");
            System.out.println("   ----     _________00__________    ----       ");
            System.out.println("            _____________________               ");
        }));
        pool.submit(saySomething(":(", 9));

        pool.shutdown();
    }
}

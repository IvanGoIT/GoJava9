package lesson.lesson12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicExample {

    volatile static String str = "1234567890:";

    static AtomicReference<String> atomicStr =
            new AtomicReference<>("atomic - 1234567890:");

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        // не бозопастный пример
        // ---------------------------------
        pool.submit(() -> {
            System.out.println(str);
            str += "000";
            System.out.println(str);
        });

        pool.submit(() -> {
            System.out.println(str);
            str += "111";
            System.out.println(str);
        });

        pool.submit(() -> {
            System.out.println(str);
            str += "222";
            System.out.println(str);
        });
        // ---------------------------------

        pool.submit(() -> {
            System.out.println(atomicStr.get());
            atomicStr.set(atomicStr.get() + "000");
            System.out.println(atomicStr.get());
        });

        pool.submit(() -> {
            System.out.println(atomicStr.get());
            atomicStr.set(atomicStr.get() + "111");
            System.out.println(atomicStr.get());
        });

        pool.submit(() -> {
            System.out.println(atomicStr.get());
            atomicStr.set(atomicStr.get() + "222");
            System.out.println(atomicStr.get());
        });

        pool.shutdown();
    }
}

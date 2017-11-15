package lesson.lesson12;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolExample2 {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        final String saveTo = "files/lesson12/nature.jpg";
        final String loadFrom = "http://wallpaperhdphotos.com/wp-content/uploads/2017/05/Beautiful-Nature-Background-Images-Simple-Beautiful-Nature-Photography-Tumblr.jpg";

        pool.submit(() -> {
            try {
                System.out.println("Загрузка началась в файл " + saveTo);
                URL website = new URL(loadFrom);
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(saveTo);
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                System.out.println("Загрузка завершилась успешно " + saveTo);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Загрузка завершилась с ошибкой " + saveTo);
            }
        });

        pool.submit(() -> {
            System.out.println("Hello World from ThreadPool");
        });

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите min и max");
        final int min = scanner.nextInt();
        final int max = scanner.nextInt();

        pool.submit(() -> {
            for(int i = min; i < max; i++)
                System.out.println( i + " - " + min + " = " + (i - min));
        });

        System.out.println("Введите count");
        int count = scanner.nextInt();
        scanner.close();
        pool.submit(PoolExample.saySomething(":(", count));

        pool.shutdown();
    }
}

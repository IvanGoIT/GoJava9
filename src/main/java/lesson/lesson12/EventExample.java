package lesson.lesson12;

import java.util.concurrent.*;

public class EventExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        int min = 5, max = 10;
        Callable<String> callable = () -> {
            String result = "";
            for(int i = min; i < max; i++)
                result += (i + " - " + min + " = " + (i - min) + "\n");
            return result;
        };

        Future<String> future = pool.submit(callable);

        String result = future.get(); // главный поток блокируется до выполнения callable
        System.out.println("Первым сабмит отработал:\n" + result);

        FutureTask<String> futureTask = new FutureTask<String>(callable) {
            @Override
            protected void done() {
                super.done();
                System.out.println("FutureTask завершен!");
                try {
                    System.out.println(get());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        pool.execute(futureTask);

        pool.shutdown();
    }
}

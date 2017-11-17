package question.question12;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        int amount = 100000;

        FutureTask<ArrayList<Integer>> task = new FutureTask<>(() -> {
            ArrayList<Integer> result = new ArrayList<>(amount);

            for(int i = 0; i < amount; i++) {
                result.add(i+1);
            }
            return result;
        });

        pool.execute(task);

        ArrayList<Integer> arrayList = task.get();
        for(int i = 0; i < 100 && i < arrayList.size(); i++) {
            System.out.println("[" + i + "]:" + arrayList.get(i));
        }

        pool.shutdown();
    }
}

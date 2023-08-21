package part15.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            CallableExample2 callable = new CallableExample2();
            Future<String> future = pool.submit(callable);
            futures.add(future);
        }
        for (Future<String> future : futures){
            String result = future.get();
            System.out.println(result);
        }
        pool.shutdown();

    }
}

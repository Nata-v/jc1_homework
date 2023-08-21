package part15.task61;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args)throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<Void>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            CallableExample3 callable = new CallableExample3();
            Future<Void> future = executorService.submit(callable);
            futures.add(future);
        }
        for (Future<Void> future : futures){
            future.get();
        }

        executorService.shutdown();

    }
}

package part15.task59;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures = new HashSet<>();

        for (int i = 0; i < 10; i++){
            Callable<List<String>> fileGenerator = new CallableExample1();
            Future<List<String>> future = pool.submit(fileGenerator);
            futures.add(future);
        }
        List<String> resultList = new ArrayList<>();
        for (Future<List<String>> f : futures){
            resultList.addAll(f.get());
        }
        System.out.println(resultList);
        pool.shutdown();
    }
}

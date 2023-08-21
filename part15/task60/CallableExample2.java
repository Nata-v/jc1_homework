package part15.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample2 implements Callable<String> {
    @Override
    public String call() throws Exception {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        Thread.sleep(2000);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        String result = Thread.currentThread().getName() +" Сумма чисел - " + sum;
        System.out.println(result);
        return result;
    }
}

package part13.task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        for (int number : numbers){
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println(Thread.currentThread().getName() +  " - среднее арифметическое - " + average);
    }
}

package part13.task54;

import java.util.Random;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            if ( number > max){
                max = number;
            }

        }
        System.out.println(Thread.currentThread().getName() + " - максимальный элемент : " + max);
    }
}

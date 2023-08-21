package part14.task58;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();
        int numbersProcessed = 0;

        Producer producer1 = new Producer(queue, numbersProcessed);
        Producer producer2 = new Producer(queue,numbersProcessed);
        Producer producer3 = new Producer(queue,numbersProcessed);
        Consumer consumer1 = new Consumer(queue,numbersProcessed);
        Consumer consumer2 = new Consumer(queue,numbersProcessed);


        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();



    }
}

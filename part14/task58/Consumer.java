package part14.task58;

import java.util.Queue;

public class Consumer extends Thread{
    private final Queue<Integer> queue;
    private int numbersProcessed;

    public Consumer(Queue<Integer> queue, int numbersProcessed) {
        this.queue = queue;
        this.numbersProcessed = numbersProcessed;
    }

    @Override
    public void run() {
        synchronized (queue) {
            while (numbersProcessed < 10000) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
                int value = queue.poll();
                System.out.println("Consumer " + getName() + " take " + value + " , queue size now: " + queue.size());
                numbersProcessed++;
                if (queue.size() >= 100) {
                    queue.notifyAll();
                }
                System.out.println("Обработано " + numbersProcessed + " элементов");

            }
        }
    }
}

package part14.task58;

import java.util.Queue;

public class Producer extends Thread{
    private final Queue<Integer> queue;

    private  int numbersProcessed;
    public  Producer(Queue<Integer> queue, int numbersProcessed){
        this.queue = queue;
        this.numbersProcessed = numbersProcessed;
    }


    @Override
    public void run() {
        synchronized (queue) {
            while (numbersProcessed < 10000) {
                while (queue.size() >= 100) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
                int value = (int) (Math.random() * 100) + 1;
                queue.add(value);

                System.out.println("Producer " + Thread.currentThread().getName() + " add " + value + " , queue size now: " + queue.size());
                numbersProcessed++;
                if (queue.size() <= 80) {
                    queue.notifyAll();
                }



            }


        }
    }
}

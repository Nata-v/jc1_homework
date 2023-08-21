package part13.task54;

public class Main {
    public static void main(String[] args) {
        for (int i =1; i <= 10; i++){
            Thread thread = new MyThread2();
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}

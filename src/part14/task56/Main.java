package part14.task56;

public class Main {
    public static void main(String[] args) {

        MyThreadNew myThreadNew = new MyThreadNew();
        for (int i = 0; i < 10; i++){
            new Thread(new MyRunnable(myThreadNew)).start();
        }
    }
}

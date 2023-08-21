package part14.task56;

public class MyRunnable implements Runnable{
    private final MyThreadNew myThreadNew;

    public MyRunnable(MyThreadNew myThreadNew) {
        this.myThreadNew = myThreadNew;
    }


    @Override
    public void run() {
        synchronized (myThreadNew) {
            myThreadNew.doSomething();
        }

    }
}

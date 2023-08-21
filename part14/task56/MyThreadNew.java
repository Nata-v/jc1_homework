package part14.task56;

public class MyThreadNew {
    void doSomething(){
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

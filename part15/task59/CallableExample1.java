package part15.task59;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableExample1 implements Callable {
    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            String fileName = "c://" + threadName + " - " + i + ".txt";
            fileList.add(fileName);
            try (OutputStream out = new FileOutputStream(fileName);
                 BufferedOutputStream bos = new BufferedOutputStream(out)){
                bos.write(("I like Java " + i).getBytes());
                bos.flush();
                System.out.println(threadName + " записал файл " + fileName);
            }
        }
        Thread.sleep(1000);
        return fileList;
    }
}

package part15.task61;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class CallableExample3 implements Callable {
    private static final String fileName = "output.txt";
    @Override
    public Void call() throws Exception {
        String message = "Hello World " + getCurrentTime();
        writeToFile(message);
        System.out.println(Thread.currentThread().getName() + " - выполняет работу.");
        return null;
    }
    private synchronized void writeToFile(String message)throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(message + "\n");
        writer.close();
    }
    private String getCurrentTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(new Date());

    }
}

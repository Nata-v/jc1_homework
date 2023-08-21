package part18.task70;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private Logger(){
        try{
            writer = new BufferedWriter(new FileWriter("log.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public void logError(String errorMessage){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String currentDate = dateFormat.format(new Date());
        String logMessage = "[" + currentDate + "] ERROR: " + errorMessage;
        try {
            writer.write(logMessage);
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void closeLogger(){
        try {
            writer.close();
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}

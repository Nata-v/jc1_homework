package part18.task68;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SingletonDate {
    private static SingletonDate instance;

    private SingletonDate() {

    }

    public static SingletonDate getInstance() {
        if (instance == null) {
            instance = new SingletonDate();
        }
        return instance;
    }

    public void printCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        String currentDate = dateFormat.format(new Date());

        System.out.println("Текущая дата: " + currentDate);
    }
}

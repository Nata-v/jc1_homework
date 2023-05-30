package part13.task55;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class MyThread3 extends Thread{
    @Override
    public void run() {
        String fileName = "file_" + Thread.currentThread().getId() + ".txt";
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(fileName))){
            Random random = new Random();
            int[] numbers = new int[10];
            for (int i =0; i < numbers.length; i++){
                numbers[i] = random.nextInt(100);
                out.write((numbers[i] + " ").getBytes());
            }
            System.out.println(Thread.currentThread().getName() + " : " + fileName);

        }catch (IOException e){
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }

    }
}

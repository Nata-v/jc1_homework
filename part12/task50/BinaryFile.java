package part12.task50;

import java.io.*;
import java.util.Random;

public class BinaryFile {
    public static void main(String[] args) {
        String fileName = "C:\\homework\\jc1_homework\\test.txt";
        int count = 20;
        int sum = 0;

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                out.writeInt(random.nextInt());
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }

        try(DataInputStream in = new DataInputStream(new FileInputStream(fileName))){

            for (int i = 0; i < count; i++){
                int number = in.readInt();
                System.out.println(number);
                sum += number;
            }
            double average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);
        } catch (IOException e){
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}

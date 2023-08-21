package part11.task46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyException3 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе мейн.");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("abc");
        Scanner scanner = new Scanner(file);
    }
}

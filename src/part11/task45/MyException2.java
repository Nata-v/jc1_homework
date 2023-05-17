package part11.task45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyException2 {
    public static void main(String[] args)  {

        File file = new File("abs");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }

    }
}

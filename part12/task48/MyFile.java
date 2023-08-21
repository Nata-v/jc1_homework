package part12.task48;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFile {
    public static void main(String[] args) {
        String path = "C:\\homework\\jc1_homework\\test.txt";
        File directory = new File(path);
        int wordsCount = 0;
        int punctuationCount = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(directory))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordsCount += countWords(line);
                punctuationCount += countPunctuation(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        System.out.println("Количество слов: " + wordsCount);
        System.out.println("Количество знаков препинания: " + punctuationCount);
    }

    private static int countWords(String text){
        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-Za-яА-Я]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            count++;
        }
        return count;
    }
    private static int countPunctuation(String text){
        int count = 0;
        Pattern pattern = Pattern.compile("[,'\".?!:;()]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            count++;
        }
        return count;
    }
}

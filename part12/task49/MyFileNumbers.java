package part12.task49;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFileNumbers {
    public static void main(String[] args) {

        String fileName = "C:\\homework\\jc1_homework\\test.txt";
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null){
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    int number = Integer.parseInt(matcher.group());
                    numbers.add(number);
                    sum += number;
                }
            }
        } catch (IOException e){
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        System.out.println("Все числа: " + numbers);
        System.out.println("Сумма чисел: " + sum);

        Set<Integer> otherNumbers = new HashSet<>(numbers);
        System.out.println("Числа без повторов: " + otherNumbers);
    }
}

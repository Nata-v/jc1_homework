package part7.task28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст: ");

        Pattern pattern = Pattern.compile("[a-zA-Za-яА-Я]+");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("В данной строке - " + count + " слов!");
    }
}

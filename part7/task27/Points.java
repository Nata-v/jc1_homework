package part7.task27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.printf("В данной строке - " + count + " знаков препинания!");
    }
}

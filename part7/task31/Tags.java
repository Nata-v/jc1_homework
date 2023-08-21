package part7.task31;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("<p[^<>]+>");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпадений: " + str.substring(start,end) + " c " + start + " по " + (end-1) + " позиции");
        }

        System.out.println(matcher.replaceAll("<p>"));
    }
}

package part7.task30;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String[] hexNumbers = findHexNumbers(str);
        System.out.println("Найденные числа: " + String.join(",", hexNumbers));
    }

    public static String[] findHexNumbers(String txt) {

        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(txt);
        return matcher.results().map(MatchResult::group).toArray(String[]::new);
    }
}

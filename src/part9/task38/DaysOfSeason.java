package part9.task38;

import java.util.Scanner;

public class DaysOfSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сезон года: ");
        Season season = Season.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Сумма дней в " + season + " составляет - " + season.getCountOfDays());

    }
}
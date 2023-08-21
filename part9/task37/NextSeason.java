package part9.task37;

import java.util.Scanner;

public class NextSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сезон года: ");
        Season currentSeason = Season.valueOf(scanner.nextLine().toUpperCase());
        Season nextSeason = currentSeason.next();
        System.out.println("Следующий сезон после " + currentSeason + " - " + nextSeason);

    }
}

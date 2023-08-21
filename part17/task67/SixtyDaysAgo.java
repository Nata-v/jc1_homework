package part17.task67;

import java.time.LocalDate;

public class SixtyDaysAgo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate ago = date.minusDays(60);
        System.out.println(ago);
    }
}

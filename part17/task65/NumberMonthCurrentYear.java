package part17.task65;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class NumberMonthCurrentYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Month month = Month.of(number);
        LocalDate date = LocalDate.now().withMonth(month.getValue());
        int daysInMonth = date.lengthOfMonth();
        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate currentDate = date.withDayOfMonth(day);

            String formattedDate = String.format("%d::%s::%d", currentDate.getDayOfMonth(), currentDate.getMonth(),
                    currentDate.getYear());
            System.out.println(formattedDate);
        }
    }
}

package part17.task66;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Schedule {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime end = now.plusMonths(2);
        LocalDateTime nextMeeting = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).withHour(13).withMinute(0).
                withSecond(0).withNano(0);
        while (nextMeeting.isBefore(end)){
            System.out.println(nextMeeting);
            nextMeeting = nextMeeting.plusWeeks(1);
        }

    }
}

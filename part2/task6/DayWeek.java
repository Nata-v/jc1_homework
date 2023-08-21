package part2.task6;

public class DayWeek {
    public static void main(String[] args) {
        int s = 58940385;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int n = (m - min) / 60;
        int h = n % 24;
        int d = (n - h) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        int week = w % 7;
        System.out.println("" + week + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд ");
    }
}

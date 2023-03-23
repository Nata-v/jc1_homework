public class task6
{
    public static void main(String[] args)
    {
        int s = 3700000;
        int sec;
        int m;
        int min, h;
        int day;
        int week;
        sec =s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        day = h/24;
        week =  day/7;
        System.out.println(h+" часов " + min + " минут " + sec + " секунд " + day + " дней " + week + " недель ");
    }
}

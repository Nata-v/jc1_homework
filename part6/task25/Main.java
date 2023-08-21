package part6.task25;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(4515);
        Time time1 = new Time(4515);
        Time time2 = new Time(15,15,1);


        System.out.println(time.getSecond());
        System.out.println(time1.getSecond());
        System.out.println(time2.getSecond());

        System.out.println(time.compareTO(time1, time));

    }
}

package part6.task25;

public class Time {
    public int second;
    public int minute;
    public int hour;

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;

    }
    public Time(int second){
        this.second = second;
    }



    public int getSecond() {
        int second2 = this.hour * 3600 + this.minute * 60 + this.second;
        return second2;
    }

    public static int compareTO(Time time1, Time time2) {
        if (time1.getSecond() > time2.getSecond()){
            return 1;
        } else if (time1.getSecond() == time2.getSecond()){
            return 0;
        }else return -1;
    }
}

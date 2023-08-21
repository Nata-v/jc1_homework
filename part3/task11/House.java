package part3.task11;

public class House {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int s1;
        int d1;
        if (a > b) {
            d1 = a;
            s1 = b;
        } else {
            s1 = a;
            d1 = b;
        }

        int c = 11;
        int d = 8;
        int s2;
        int d2;
        if (c > d) {
            s2 = d;
            d2 = c;
        } else {
            s2 = c;
            d2 = d;
        }

        int e = 13;
        int f = 14;
        int sy;
        int dy;
        if (e < f) {
            sy = e;
            dy = f;
        } else {
            sy = f;
            dy = e;
        }

        if (d1 + s2 <= dy && s1 <= sy && d2 <= sy) {
            System.out.println("Дома на данном участке помещаются!");
        } else if (s1 + s2 <= dy && d1 <= sy && d2 <= sy) {
            System.out.println("Дома на данном участке помещаются!");
        } else if (s1 + d2 <= dy && s1 <= sy && d2 <= sy) {
            System.out.println("Дома на данном участке помещаются!");
        } else if (d1 + d2 <= dy && s1 <= sy && s2 <= sy) {
            System.out.println("Дома на данном участке помещаются!");
        } else {
            System.out.println("В таком случае дома на данном участке не помещаются!");
        }

    }
}

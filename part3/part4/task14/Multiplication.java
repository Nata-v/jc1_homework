package part4.task14;

public class Multiplication {
    public static void main(String[] args) {
        long s = 1L;
        int i = 0;

        do {
            ++i;
            s *= (long)i;
        } while(i < 25);

        System.out.println(s);
    }
}

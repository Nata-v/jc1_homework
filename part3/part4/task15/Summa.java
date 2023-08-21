package part4.task15;

public class Summa {
    public static void main(String[] args) {
        int a = 1893823445;
        int i = 0;
        int sum = 0;

        do {
            int s = a % 10;
            a = (a - s) / 10;
            ++i;
            sum += s;
        } while(i <= 10);

        System.out.println(sum);
    }
}

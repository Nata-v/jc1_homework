package part4.task18;

public class Number {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;

        for(int j = 1000000000; j > 0; j /= 1000) {
            int n = a / j;
            n %= 1000;
            if (n != 0) {
                System.out.print("" + n + " ");
            }
        }

    }
}

package part4.task13;

public class Factorial {
    public static void main(String[] args) {
        int sum = 1;
        int i = 0;

        for(int n = 0; n <= 10; ++n) {
            while(i <= n) {
                if (i == 0) {
                    sum = 1;
                    ++i;
                } else {
                    sum *= i;
                    ++i;
                }
            }

            System.out.println("" + n + "! = " + sum);
            i = 1;
            sum = 1;
        }

    }
}

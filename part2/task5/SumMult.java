package part2.task5;

public class SumMult {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        System.out.print(sumNumbers(a, b));
    }

    public static int sumNumbers(int c, int d) {
        int result = c + d + c * d;
        return result;
    }
}

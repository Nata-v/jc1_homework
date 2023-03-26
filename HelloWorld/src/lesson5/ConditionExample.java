package lesson5;

public class ConditionExample {
    public static void main(String[] args) {
        boolean y = false;
        int x = 96;
        if (x % 16 == 0) {
            y = true;
        } else {
            y = false;
        }
        System.out.println(y);
    }
}

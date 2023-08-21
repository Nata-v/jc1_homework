package part4.task16;

public class SimpleNumber {
    public static void main(String[] args) {
        int x = 0;

        for(int i = 50; i <= 70; ++i) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0) {
                ++x;
                if (x == 2) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}

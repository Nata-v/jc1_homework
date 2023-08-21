package part5.task21;

public class Massiv3 {
    public static void main(String[] args) {
        int[] marks = new int[10];

        int b;
        for(b = 0; b <= 9; ++b) {
            marks[b] = (int)(Math.random() * 10.0 + 1.0);
            System.out.print(marks[b] + " ");
        }

        System.out.println();
        b = 0;
        int m = 0;

        for(int i = 0; i <= 9; ++i) {
            if (marks[i] > b) {
                b = marks[i];
                m = i;
            }
        }

        System.out.print(m);
    }
}

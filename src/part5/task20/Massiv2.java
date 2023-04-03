package part5.task20;

public class Massiv2 {
    public static void main(String[] args) {
        int[] marks = new int[10];

        int i;
        for(i = 0; i <= 9; ++i) {
            marks[i] = (int)(Math.random() * 10.0 + 1.0);
            System.out.print(marks[i] + " ");
        }

        System.out.println();

        for(i = 0; i < 10; ++i) {
            if ((i + 1) % 2 == 0) {
                System.out.print(marks[i] + " ");
            }
        }

    }
}

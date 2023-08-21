package part5.task23;

public class Massiv5 {
    public static void main(String[] args) {
        int[] marks = new int[10];

        for (int i = 0; i <= 9; ++i) {
            marks[i] = (int) (Math.random() * 10.0 + 1.0);
            System.out.print(marks[i] + " ");
        }

        int sum = 0;
        for(int i = 0; i <= 4; i++) {
            sum = marks[i];
            marks[i] = marks[marks.length-1-i];
            marks[marks.length-1-i] = sum;

        }
        System.out.println();
        for (int i = 0; i <=9; ++i)

            System.out.print(marks[i] + " ");

    }
}

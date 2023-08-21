package part5.task22;

public class Massiv4 {
    public static void main(String[] args) {
        int[] marks = new int[10];

        for (int i = 0; i <= 9; ++i) {
            marks[i] = (int) (Math.random() * 10.0 + 1.0);
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        int big = 0;
        int bigInd = 0;
        int min =10;
        int minInd =0;

        for (int i = 0; i <= 9; ++i) {
            if (marks[i] > big) {
                big = marks[i];
                bigInd = i;

            }

            if (marks[i] < min) {
                min = marks[i];
                minInd = i;
            }

        }

        int sum = 0;
        if (minInd < bigInd)
            for (int i = minInd + 1; i < bigInd; ++i) {
                sum += marks[i];
            }
        else
            for (int i = bigInd + 1; i < minInd; ++i) {
                sum += marks[i];
            }

        System.out.println(sum);
    }
}

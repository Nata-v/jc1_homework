package part5.task24;

public class Massiv6 {
    public static void main(String[] args) {
        int marks[][] = new int[5][5];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (i > j || j >= marks[i].length-i  )
                    marks[i][j] = 0;
                else
                    marks[i][j] = 1;

                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 3; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (i < j || j <= marks[i].length-2-i)
                    marks[i][j] = 0;
                else
                    marks[i][j] = 1;
                System.out.print(marks[i][j] + " ");



            }
            System.out.println();
        }


    }
}

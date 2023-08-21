package part10.task40;

import java.util.ArrayList;

public class DeletedNegativeMarks {
    public static void main(String[] args) {

        int element = 10;
        int negative = 6;
        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < element; i++){
            int a = (int)(Math.random() * 10 + 1);
            mark.add(a);

        }
        System.out.println("Оценки учеников: " + mark);

        ArrayList<Integer> negativeList = new ArrayList<>();
        for (int i = 0; i < element; i++){
            int k = mark.get(i);
            if (k <= negative){
                negativeList.add(k);
            }
        }
        mark.removeAll(negativeList);
        System.out.println("Только хорошие оценки: " + mark);
    }
}

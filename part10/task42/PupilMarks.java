package part10.task42;

import java.util.ArrayList;
import java.util.Iterator;

public class PupilMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        int n = 20;

        for (int i = 0; i < n; i++) {
            int mark = (int) (Math.random() * 10 + 1);
            marks.add(mark);
        }
        System.out.println("Оценки учеников: " + marks);

        Iterator<Integer> iterator = marks.iterator();
        int maxMark = 0;
        while (iterator.hasNext()){
            int mark = iterator.next();
            if (mark > maxMark ){
                maxMark = mark;
            }
        } System.out.println("Самая высокая оценка: " + maxMark);
    }
}

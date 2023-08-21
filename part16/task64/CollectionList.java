package part16.task64;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        int n = 100;
        int minValue = 0;
        int maxValue = 100;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int value = (int)(Math.random()* (maxValue-minValue)) + minValue;
            list.add(value);
        }
        boolean containsMultipleOf3and5 = list.stream()
                .anyMatch(value-> value % 3 == 0 && value % 5 == 0);
        System.out.println("Содержатся ли числа, которые делятся на 3 и на 5? - " + containsMultipleOf3and5);
    }
}

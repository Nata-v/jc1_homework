package part10.task41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RepeatingNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < n; i++){
            int number = random.nextInt(51);
            numbers.add(number);
        }
        System.out.println("Коллекция: " + numbers);

        List newList = new ArrayList(new HashSet(numbers));
        System.out.println("Коллекция после удаления дубликатов: " + newList);
    }
}

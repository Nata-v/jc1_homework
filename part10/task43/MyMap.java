package part10.task43;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");

        String text = scanner.nextLine();
        String[] words = text.split("\\s+");

        Map<String,Integer> textMap = new HashMap<>();
        for (String word : words){
            if (!textMap.containsKey(word)){
                textMap.put(word,1);
            }else {
                int count = textMap.get(word);
                textMap.put(word,count + 1);
            }
        }
        for (Map.Entry<String,Integer> entry : textMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}

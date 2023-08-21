package part16.task62;

import java.util.stream.IntStream;

public class LambdaProgramm {
    public static void main(String[] args) throws Exception {

        IntStream.rangeClosed(1,20)
                .filter(n -> n % 2 == 0)
                .mapToDouble(n ->{
                    System.out.println(n + " дюймов = " + n*2.54 + " сантиметров");
                    return n*2.54;
                })
                .reduce(Double::sum)
                .ifPresent(sum-> System.out.println("Общая сумма: " + sum + " сантиметров"));
    }
}

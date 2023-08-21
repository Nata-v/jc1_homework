package part16.task63;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static String getName(){
        String[] names = {"Mary", "Kate", "Natali", "Alex", "Peter", "Max", "Bob", "Tom", "Ann", "Chris"};
        return names[(int)(Math.random()* names.length)];
    }
    private static String getSurname(){
        String[] surnames = {"White", "Black", "Smith", "Jackson", "Cooper", "Marley", "Bush", "Clark", "London", "Gates"};
        return surnames[(int)(Math.random()*surnames.length)];
    }
    private static int getAge(){
        return (int)(Math.random()*16) + 15;
    }


    public static void main(String[] args) {
        List<String> surnames = Stream.generate(()-> new Person(getName(),getSurname(),getAge()))
                .limit(100)
                .filter(p-> p.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println("Families" + surnames);


    }
}

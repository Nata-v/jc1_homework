package part18.task69;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.println("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        Person person = new Person.Builder().setFirstName(firstName).setLastName(lastName).setBirthYear(birthYear).build();

        System.out.println("Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Year of birth: " + person.getBirthYear());
    }
}

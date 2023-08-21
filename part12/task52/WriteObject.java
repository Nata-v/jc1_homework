package part12.task52;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class WriteObject {
    public static void main(String[] args) {


        Person[] persons = new Person[10];
        Random random = new Random();
        String[] names = {"OLga", "Petr", "Alex", "Anna", "Nik", "Nata", "Kate", "Bob", "Jack", "Ivan"};
        String[] surnames = {"Novikova", "Ivanov", "Petrov", "Volkova", "Sidorov", "Nikolaev", "Romanov", "Matveeva", "Bobrov", "Jackson"};
        for (int i = 0; i < persons.length; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            int age = random.nextInt(50) + 18;
            persons[i] = new Person(name, surname, age);
        }

        try (FileOutputStream fos = new FileOutputStream("c:/people.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(persons);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

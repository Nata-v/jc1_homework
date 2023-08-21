package part16.task63;

public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " лет";
    }

    @Override
    public int compareTo(Person o) {
        return surname.compareTo(String.valueOf(o));
    }


}

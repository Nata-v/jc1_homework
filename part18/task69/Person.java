package part18.task69;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
    public static class Builder{
        private Person person;
        public Builder(){
            person = new Person("Ivan", "Ivanov", 1985);
        }
        public Builder setFirstName(String firstName){
            person.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            person.lastName = lastName;
            return this;
        }
        public Builder setBirthYear(int birthYear){
            person.birthYear = birthYear;
            return this;
        }
        public Person build(){
            return person;
        }
    }
}

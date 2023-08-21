package part19.task71;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Man {
    private  String name;
    private int age;
    private String occupation;

    public Man(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
    public void sayHello(){
        System.out.println("Hello! My name is " + name + ".");
    }
    public void introduce(){
        System.out.println("My name is " + name + ". I'm " + age + " years old and I'm work as " + occupation + ".");

    }
    public void doWork(){
        System.out.println(name + " do his work.");
    }

    public static void main(String[] args) {
        Man man = new Man("Ivan", 35, "engineer");
        man.printClassInfo();
    }
    public void printClassInfo(){
        Class<?> clazz = this.getClass();

        System.out.println("Имя класса: " + clazz.getName());// getSimpleName()
        System.out.println("Поля класса:");
        for (Field field : clazz.getDeclaredFields()){
            System.out.println(field.getName() + " :" + field.getType().getSimpleName());
        }
        System.out.println("Методы класса:");
        for (Method method : clazz.getDeclaredMethods()){
            System.out.println(method.getName());
        }
    }
}

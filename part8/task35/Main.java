package part8.task35;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Ivanov Ivan Ivanovich",10,160);
        worker.getSalary(); //1600

        part8.task35.Manager manager = new Manager("Petrov Petr Petrovich", 10,160,10000,0.05);
        manager.getSalary(); //2150

        Director director = new Director("Sidorov Ivan Ivanovich",10,160,10000, 0.05, 5000);
        director.getSalary();//7150

        System.out.println("Зарплата директора: " + director.getSalary());
        System.out.println("Зарплата менеджера: " + manager.getSalary());
        System.out.println("Зарплата рабочего: " + worker.getSalary());
    }
}

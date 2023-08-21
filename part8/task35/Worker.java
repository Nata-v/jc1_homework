package part8.task35;

public class Worker {
    private String name;
    private int hourlyRate;
    private int hoursWorker;

    public Worker(String name, int hourlyRate, int hoursWorker) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorker = hoursWorker;
    }
    public int getSalary(){
        return hourlyRate * hoursWorker;
    }
    public String getName(){
        return name;
    }
}

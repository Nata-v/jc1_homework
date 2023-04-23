package part8.task35;

public class Worker  {
    private String name;
    private int hourlyRate;
    private int hoursWorked;

    public Worker(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public int getSalary() {
        return hourlyRate * hoursWorked;
    }
    public String getName(){
        return name;
    }
}


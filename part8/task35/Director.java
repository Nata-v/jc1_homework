package part8.task35;

public class Director extends Manager{
    private int bonus;

    public Director(String name, int hourlyRate, int hoursWorked, int sales, double commissionRate, int bonus){
        super(name, hourlyRate, hoursWorked, sales, commissionRate);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return (super.getSalary() + bonus);
    }
}

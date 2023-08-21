package part8.task35;

public class Manager extends Worker{
    private int sales;
    private double commissionRate;

    public Manager(String name, int hourlyRate, int hoursWorked, int sales, double commissionRate){
        super(name, hourlyRate, hoursWorked);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public int getSalary() {
        return (int) (super.getSalary() + (sales * commissionRate));
    }
}

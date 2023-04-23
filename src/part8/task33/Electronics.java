package part8.task33;

public class Electronics implements TurnOnSocket{
    private int power;
    public int weight;
    private String model;

    public Electronics(int power, int weight, String model) {
        this.power = power;
        this.weight = weight;
        this.model = model;
    }
    public int getPower() {
        return power;
    }

    public int  getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }
    public void turnOnSocket() {
        System.out.println("Включение бытовой техники в розетку!");
    }


    @Override
    public void startMotor() {
        System.out.println("Запуск мотора!");
    }

    @Override
    public void stopMotor() {
        System.out.println("Остановка мотора!");
    }
}

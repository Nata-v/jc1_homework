package part8.task33;

public class KitchenElectronics extends MotorElectronics{
    private String knifeType;
    private int serving;

    public KitchenElectronics(int motorSpeed, String motorType, int motorPower, int power, int weight, String model, int serving, String knifeType){
        super(motorSpeed, motorType, motorPower, power, weight ,model);
        this.serving = serving;
        this.knifeType = knifeType;
    }

    public int getServing() {
        return serving;
    }

    public String getKnifeType() {
        return knifeType;
    }
    public void sliceFood(){
        System.out.println("Нарезка продуктов!");
    }
    public void cookFood(){
        System.out.println("Приготовление еды!");
    }
}

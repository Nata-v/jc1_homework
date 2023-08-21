package part8.task33;

public class MotorElectronics extends Electronics{
    private int motorPower;
    private String motorType;
    private int motorSpeed;

    public MotorElectronics(int motorSpeed, String motorType, int motorPower, int power, int weight, String model) {
        super(power, weight, model);
        this.motorPower = motorPower;
        this.motorSpeed = motorSpeed;
        this.motorType = motorType;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public String getMotorType() {
        return motorType;
    }

    public int getMotorSpeed() {
        return motorSpeed;
    }


    public void stopMotor() {
        System.out.println("Остановка мотора!");
    }
}

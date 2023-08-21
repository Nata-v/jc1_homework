package part8.task33;

public class Main {
    public static void main(String[] args) {
        Electronics fridge = new Electronics(1500,50,"Sony");
        fridge.turnOnSocket();
        fridge.startMotor();

        MotorElectronics grill = new MotorElectronics(70,"DWD320",600, 200, 20, "Bosh");
        grill.turnOnSocket();
        grill.startMotor();


        KitchenElectronics blender = new KitchenElectronics(60,"DS65", 500, 100, 4, "Philips",30,"нож для измельчения");
        blender.turnOnSocket();
        blender.startMotor();
        blender.sliceFood();
        blender.cookFood();
        blender.stopMotor();
    }
}

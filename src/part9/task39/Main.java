package part9.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Garage<Car> carGarage = new Garage<>();
        System.out.println("Enter car name: ");
        String carName = scanner.nextLine();
        Car car = new Car(carName);
        carGarage.park(car);
        System.out.println("Car name inside garage: " + carGarage.getVehicle().getName());

        Garage<Motorcycle> motorcycleGarage = new Garage<>();
        System.out.println("Enter motorcycle name: ");
        String motorcycleName = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(motorcycleName);
        motorcycleGarage.park(motorcycle);
        System.out.println("Motorcycle name inside garage: " + motorcycleGarage.getVehicle().getName());
    }
}

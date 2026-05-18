package vehiclesystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleInformationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Car Input
            System.out.println("=== Enter Car Details ===");

            System.out.print("Enter Car Make: ");
            String carMake = input.nextLine();

            System.out.print("Enter Car Model: ");
            String carModel = input.nextLine();

            System.out.print("Enter Car Year: ");
            int carYear = input.nextInt();

            Car car = new Car(carMake, carModel, carYear);

            System.out.print("Enter Number of Doors: ");
            int doors = input.nextInt();
            input.nextLine();

            car.setNumberOfDoors(doors);

            System.out.print("Enter Fuel Type: ");
            String fuel = input.nextLine();

            car.setFuelType(fuel);

            // Motorcycle Input
            System.out.println("\n=== Enter Motorcycle Details ===");

            System.out.print("Enter Motorcycle Make: ");
            String motorMake = input.nextLine();

            System.out.print("Enter Motorcycle Model: ");
            String motorModel = input.nextLine();

            System.out.print("Enter Motorcycle Year: ");
            int motorYear = input.nextInt();

            Motorcycle motorcycle =
                    new Motorcycle(motorMake, motorModel, motorYear);

            System.out.print("Enter Number of Wheels: ");
            int wheels = input.nextInt();
            input.nextLine();

            motorcycle.setNumberOfWheels(wheels);

            System.out.print("Enter Motorcycle Type: ");
            String motorType = input.nextLine();

            motorcycle.setMotorcycleType(motorType);

            // Truck Input
            System.out.println("\n=== Enter Truck Details ===");

            System.out.print("Enter Truck Make: ");
            String truckMake = input.nextLine();

            System.out.print("Enter Truck Model: ");
            String truckModel = input.nextLine();

            System.out.print("Enter Truck Year: ");
            int truckYear = input.nextInt();

            Truck truck = new Truck(truckMake, truckModel, truckYear);

            System.out.print("Enter Cargo Capacity: ");
            double capacity = input.nextDouble();
            input.nextLine();

            truck.setCargoCapacity(capacity);

            System.out.print("Enter Transmission Type: ");
            String transmission = input.nextLine();

            truck.setTransmissionType(transmission);

            // Display Information
            System.out.println("\n================================");
            System.out.println("VEHICLE INFORMATION");
            System.out.println("================================");

            car.displayInfo();
            motorcycle.displayInfo();
            truck.displayInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input entered.");
        }

        input.close();
    }
}
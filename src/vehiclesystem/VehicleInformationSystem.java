package vehiclesystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleInformationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // =========================
            // CAR DETAILS
            // =========================
            System.out.println("=== Enter Car Details ===");

            System.out.print("Enter Car Make: ");
            String carMake = input.nextLine();

            if (carMake.isEmpty()) {
                throw new IllegalArgumentException("Car make cannot be empty.");
            }

            System.out.print("Enter Car Model: ");
            String carModel = input.nextLine();

            if (carModel.isEmpty()) {
                throw new IllegalArgumentException("Car model cannot be empty.");
            }

            System.out.print("Enter Car Year: ");
            int carYear = input.nextInt();

            if (carYear < 1886 || carYear > 2026) {
                throw new IllegalArgumentException("Invalid car year entered.");
            }

            Car car = new Car(carMake, carModel, carYear);

            System.out.print("Enter Number of Doors: ");
            int doors = input.nextInt();

            if (doors <= 0) {
                throw new IllegalArgumentException("Number of doors must be greater than 0.");
            }

            input.nextLine();

            car.setNumberOfDoors(doors);

            System.out.print("Enter Fuel Type (Petrol/Diesel/Electric): ");
            String fuel = input.nextLine();

            if (!(fuel.equalsIgnoreCase("Petrol")
                    || fuel.equalsIgnoreCase("Diesel")
                    || fuel.equalsIgnoreCase("Electric"))) {

                throw new IllegalArgumentException(
                        "Fuel type must be Petrol, Diesel, or Electric.");
            }

            car.setFuelType(fuel);

            // =========================
            // MOTORCYCLE DETAILS
            // =========================
            System.out.println("\n=== Enter Motorcycle Details ===");

            System.out.print("Enter Motorcycle Make: ");
            String motorMake = input.nextLine();

            System.out.print("Enter Motorcycle Model: ");
            String motorModel = input.nextLine();

            System.out.print("Enter Motorcycle Year: ");
            int motorYear = input.nextInt();

            if (motorYear < 1886 || motorYear > 2026) {
                throw new IllegalArgumentException("Invalid motorcycle year.");
            }

            Motorcycle motorcycle =
                    new Motorcycle(motorMake, motorModel, motorYear);

            System.out.print("Enter Number of Wheels: ");
            int wheels = input.nextInt();

            if (wheels < 2) {
                throw new IllegalArgumentException(
                        "Motorcycle must have at least 2 wheels.");
            }

            input.nextLine();

            motorcycle.setNumberOfWheels(wheels);

            System.out.print("Enter Motorcycle Type (Sport/Cruiser/Off-road): ");
            String motorType = input.nextLine();

            motorcycle.setMotorcycleType(motorType);

            // =========================
            // TRUCK DETAILS
            // =========================
            System.out.println("\n=== Enter Truck Details ===");

            System.out.print("Enter Truck Make: ");
            String truckMake = input.nextLine();

            System.out.print("Enter Truck Model: ");
            String truckModel = input.nextLine();

            System.out.print("Enter Truck Year: ");
            int truckYear = input.nextInt();

            if (truckYear < 1886 || truckYear > 2026) {
                throw new IllegalArgumentException("Invalid truck year.");
            }

            Truck truck = new Truck(truckMake, truckModel, truckYear);

            System.out.print("Enter Cargo Capacity (tons): ");
            double capacity = input.nextDouble();

            if (capacity <= 0) {
                throw new IllegalArgumentException(
                        "Cargo capacity must be greater than 0.");
            }

            input.nextLine();

            truck.setCargoCapacity(capacity);

            System.out.print("Enter Transmission Type (Manual/Automatic): ");
            String transmission = input.nextLine();

            if (!(transmission.equalsIgnoreCase("Manual")
                    || transmission.equalsIgnoreCase("Automatic"))) {

                throw new IllegalArgumentException(
                        "Transmission must be Manual or Automatic.");
            }

            truck.setTransmissionType(transmission);

            // =========================
            // DISPLAY RESULTS
            // =========================
            System.out.println("\n================================");
            System.out.println("VEHICLE INFORMATION SYSTEM");
            System.out.println("================================");

            car.displayInfo();
            motorcycle.displayInfo();
            truck.displayInfo();

        } catch (InputMismatchException e) {

            System.out.println(
                    "Error: Invalid data type entered. Please enter correct values.");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            input.close();

            System.out.println("\nProgram ended successfully.");
        }
    }
}
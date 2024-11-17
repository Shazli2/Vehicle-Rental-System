package VehicleRental2;


public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();

        // Add vehicles
        Vehicle car = new Car("ABC123", "Red", 50.0);
        Vehicle truck = new Truck("DEF456", "Blue", 100.0);
        Vehicle motorcycle = new Motorcycle("GHI789", "Black", 30.0);

        rentalSystem.addVehicle(car);
        rentalSystem.addVehicle(truck);
        rentalSystem.addVehicle(motorcycle);

        // Add customers
        Customer customer1 = new Customer("John Doe", "123 Elm Street", 30);
        Customer customer2 = new Customer("Jane Smith", "456 Oak Avenue", 25);

        // Rent vehicles
        car.rent(customer1);
        System.out.println("Car rented by: " + customer1);

        // Return vehicle
        car.returnVehicle();
        System.out.println("Car returned!");

        // Get last 5 rentals
        car.rent(customer2);
        System.out.println("Last 5 Rentals: " + car.getLast5Rentals());

        // Display available vehicles
        System.out.println("Available Vehicles: " + rentalSystem.getAvailableVehicles());
    }
}

package VehicleRental2;

import VehicleRental2.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isRented()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public Vehicle findVehicleByLicensePlate(String licensePlate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.toString().contains(licensePlate)) {
                return vehicle;
            }
        }
        return null;
    }
}

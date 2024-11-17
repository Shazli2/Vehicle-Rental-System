package VehicleRental2;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String licensePlate;
    private String color;
    private double pricePerDay;
    private boolean isRented;
    private List<Customer> rentalHistory = new ArrayList<>();

    public Vehicle(String licensePlate, String color, double pricePerDay) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.pricePerDay = pricePerDay;
        this.isRented = false;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent(Customer customer) {
        if (!isRented) {
            isRented = true;
            addToRentalHistory(customer);
        } else {
            throw new IllegalStateException("Vehicle is already rented.");
        }
    }

    public void returnVehicle() {
        if (isRented) {
            isRented = false;
        } else {
            throw new IllegalStateException("Vehicle is already free.");
        }
    }

    public double calculateTotalRentalPrice(int days) {
        return days * pricePerDay;
    }

    public List<Customer> getLast5Rentals() {
        int start = Math.max(0, rentalHistory.size() - 5);
        return rentalHistory.subList(start, rentalHistory.size());
    }

    private void addToRentalHistory(Customer customer) {
        rentalHistory.add(customer);
    }

    @Override
    public String toString() {
        return String.format("License Plate: %s, Color: %s, Price/Day: %.2f, Rented: %b",
                licensePlate, color, pricePerDay, isRented);
    }
}

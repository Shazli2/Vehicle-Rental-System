package VehicleRental2;

public class Customer {
    private String name;
    private String address;
    private int age;

    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Address: %s, Age: %d", name, address, age);
    }
}

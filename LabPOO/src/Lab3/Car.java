package Lab3;

public class Car extends GroundVehicle {
    static String name(String brand, String model) {
        return brand + model;
    }
    static String name(String brand, String model, String generation) {
        return brand + model + generation;
    }
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    public void accelerate() {
        System.out.println("Accelerating on the road.");
    }
}

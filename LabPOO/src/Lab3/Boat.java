package Lab3;

public class Boat extends WaterVehicle {
    static String name(String brand, String model) {
        return brand + model;
    }
    static String name(String brand, String model, String generation) {
        return brand + model + generation;
    }
    @Override
    public void start() {
        System.out.println("Boat is starting.");
    }
    public void sail() {
        System.out.println("Sailing on the water.");
    }
}

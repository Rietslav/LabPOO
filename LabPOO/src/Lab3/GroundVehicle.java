package Lab3;

public class GroundVehicle extends Vehicle {

    @Override
    public void start() {
        System.out.println("GroundVehicle is starting.");
    }
    public void drive() {
        System.out.println("Driving on the ground.");
    }
}
